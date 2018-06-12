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
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author flordan
 */
public class FileReader extends java.io.InputStreamReader {

    public FileReader(String path) throws FileNotFoundException, IOException {
        super(new FileInputStream(path));
    }

    public FileReader(File f) throws FileNotFoundException, IOException {
        super(new FileInputStream(f));
    }

    public FileReader(FileDescriptor fd) throws FileNotFoundException {
        super(new FileInputStream(fd));
    }

}
