package com.px.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF是基于指针操作的，低八位有效
 * 移动指针
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("data2","rw");
//        读取文件读取的都是字符串，或者是写入的时候也是字符串
//        raf.write("12433123".getBytes());
//        读写都需要移动指针
//        打开文件后指针的位置
        long filePointer = raf.getFilePointer();
        System.out.println(filePointer);
        int read = raf.read();
        System.out.println(read);
        long filePointer1 = raf.getFilePointer();
        System.out.println("读操作后的指针位置："+filePointer1);
        raf.seek(2);
        System.out.println(raf.getFilePointer());
        raf.close();
    }
}
