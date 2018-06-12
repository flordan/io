/*
 *  Copyright 2002-2018 Barcelona Supercomputing Center (www.bsc.es)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package es.bsc.compss.loader.io;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileInputStream extends java.io.FileInputStream {

	private static final File DEFAULT_ROOT;

	static {
		File defaultRoot = null;
		try {
			defaultRoot = File.createTempFile("tmp", ".io");
			defaultRoot.deleteOnExit();
		} catch (IOException ex) {
			Logger.getLogger(FileInputStream.class.getName()).log(Level.SEVERE, null, ex);
		}
		DEFAULT_ROOT = defaultRoot;
	}

	private final java.io.FileInputStream real;

	public FileInputStream(String name) throws FileNotFoundException {
		super(DEFAULT_ROOT);
		String newName;
		try {
			newName = FileRegistry.checkFile(name);
		} catch (IOException ioe) {
			newName = name;
		}
		real = new java.io.FileInputStream(newName);
	}

	public FileInputStream(File f) throws FileNotFoundException {
		super(DEFAULT_ROOT);
		File newFile;
		try {
			newFile = FileRegistry.checkFile(f);
		} catch (IOException ioe) {
			newFile = f;
		}
		real = new java.io.FileInputStream(newFile);
	}

	@Override
	public int read() throws IOException {
		return real.read();
	}

	@Override
	public int read(byte[] arg0) throws IOException {
		return real.read(arg0);
	}

	@Override
	public int read(byte[] arg0, int arg1, int arg2) throws IOException {
		return real.read(arg0, arg1, arg2);
	}

	@Override
	public long skip(long n) throws IOException {
		return real.skip(n);
	}

	@Override
	public int available() throws IOException {
		return real.available();
	}

	@Override
	public void close() throws IOException {
		System.out.println("Callign close");
		real.close();
	}
}
