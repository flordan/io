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
package es.bsc.compss.loader.io.Test;

import es.bsc.compss.loader.io.FileInputStream;
import es.bsc.compss.loader.io.FileRegistry;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws Exception {
		String path = "/tmp/Test";

		FileRegistry.addFile(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		while (true) {
			String line = br.readLine();
			if (line != null) {
				System.out.println(line);
			}
		}
		//br.close();
	}
}
