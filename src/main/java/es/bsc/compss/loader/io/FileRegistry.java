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
import java.util.TreeSet;


public class FileRegistry {

    private static final TreeSet<String> REGISTERED_FILES = new TreeSet<>();

    private FileRegistry() {
    }

    public static void addTaskFile(String path) throws IOException {
        File f = new File(path);
        String canPath = f.getCanonicalPath();
        REGISTERED_FILES.add(canPath);
    }

    public static void addTaskFile(File file) {

    }

    public static boolean isRegistered(String path) throws IOException {
        File f = new File(path);
        String canPath = f.getCanonicalPath();
        return REGISTERED_FILES.contains(canPath);
    }

    public static boolean isRegistered(File f) throws IOException {
        String canPath = f.getCanonicalPath();
        return REGISTERED_FILES.contains(canPath);
    }

    public static boolean isRegistered(FileDescriptor fd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
