package com.px.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRead1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rw = new RandomAccessFile("data.txt", "rw");
        int read = rw.read();
//        System.out.println(read);
    }
}
