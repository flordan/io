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
import java.io.FileDescriptor;
import java.io.IOException;


public class FileInputStream extends java.io.FileInputStream {

    public FileInputStream(String name) throws FileNotFoundException, IOException {
        super(FileRegistry.isRegistered(name) ? bringFile(name) : name);
    }

    public FileInputStream(File f) throws FileNotFoundException, IOException {
        super(FileRegistry.isRegistered(f) ? bringFile(f) : f);
    }

    public FileInputStream(FileDescriptor fd) {
        super(FileRegistry.isRegistered(fd) ? bringFile(fd) : fd);
    }

    private static String bringFile(String name) {
        System.out.println("Aqui miraria d'obtenir la ultima versio del fitxer");
        return name;
    }

    private static File bringFile(File f) {
        return f;
    }

    private static FileDescriptor bringFile(FileDescriptor fd) {
        return fd;
    }

    @Override
    public int read() throws IOException {
        System.out.println("Calls read()");
        return super.read();
    }

    @Override
    public int read(byte[] bytes) throws IOException {
        System.out.println("Calls read(byte[])");
        return super.read(bytes);
    }

    @Override
    public int read(byte[] bytes, int i, int i1) throws IOException {
        System.out.println("Calls read(byte[], int , int)");
        return super.read(bytes, i, i1);
    }
}
