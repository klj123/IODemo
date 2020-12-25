package com.px.ftestFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文件中的内容
 */
public class TestFile5 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("data.txt","r");
        File file = new File("data1.txt");
        if (file.isDirectory()){
            file.mkdir();
        }
        RandomAccessFile raf1 = new RandomAccessFile("data1.txt","rw");
        long start = System.currentTimeMillis();
        byte[] bytes = new byte[1024*10];
        if (raf.read(bytes) != -1){
            raf1.write(bytes);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
