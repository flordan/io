/*
 *  Copyright 2002-2016 Barcelona Supercomputing Center (www.bsc.es)
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
import java.io.IOException;
import java.util.TreeMap;

public class FileRegistry {

	private static final TreeMap<String, String> file2Rename = new TreeMap<>();

	private FileRegistry() {
	}

	public static String checkFile(String path) throws IOException {
		String canonical = new File(path).getCanonicalPath();
		String newPath = file2Rename.get(canonical);
		if (newPath != null) {
			return newPath;
		} else {
			return path;
		}
	}

	public static File checkFile(File f) throws IOException {
		String canonical = f.getCanonicalPath();
		String newPath = file2Rename.get(canonical);
		if (newPath != null) {
			return new File(newPath);
		} else {
			return f;
		}
	}

	public static void addFile(String path) {
		file2Rename.put(path, path + "2");
	}
}
