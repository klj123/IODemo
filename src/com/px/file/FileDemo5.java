package com.px.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 */
public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile read = new RandomAccessFile("data.txt","r");
        RandomAccessFile write = new RandomAccessFile("data1.txt","rw");
//        现将本地的文件读取到内存中，将内存中的文件写入到本地文件中
        long start = System.currentTimeMillis();
        int d = 0;
        while ((d = read.read()) != -1){
            write.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制文件耗时"+(end-start)+"毫秒");
    }
}
