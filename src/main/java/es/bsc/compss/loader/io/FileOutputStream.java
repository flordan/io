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

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStream extends java.io.FileOutputStream {

	public FileOutputStream(String name) throws FileNotFoundException {
		super(name);
	}

	public FileOutputStream(String name, boolean append) throws FileNotFoundException {
		super(name, append);
	}

	public FileOutputStream(File file) throws FileNotFoundException {
		super(file);
	}

	public FileOutputStream(File file, boolean append) throws FileNotFoundException {
		super(file, append);
	}

	public FileOutputStream(FileDescriptor fdObj) {
		super(fdObj);
	}

	@Override
	public void write(int b) throws IOException {
		super.write(b);
	}

	@Override
	public void write(byte[] arg0) throws IOException {
		super.write(arg0);
	}

	@Override
	public void write(byte[] arg0, int arg1, int arg2) throws IOException {
		super.write(arg0, arg1, arg2);
	}

}
