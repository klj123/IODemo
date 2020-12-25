package com.px.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile read = new RandomAccessFile("","r");
        RandomAccessFile write = new RandomAccessFile("","r");
        byte[] buff = new byte[1024*10];
        int d = 0;
        long start = System.currentTimeMillis();
        while ((d = read.read(buff)) != -1){
//            使用偏移量的缓冲来写，避免缓冲区有空白写进来，使得文件变大
            write.write(buff,0,d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制文件耗时："+(end-start)+"毫秒");
    }
}
