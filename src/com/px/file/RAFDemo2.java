package com.px.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 实现记事本功能
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
//        先让用户输入笔记名，然后再接收文件内容，最后保存
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
//        File file = new File("a.txt");
//        if (!file.isDirectory()){
//            file.
//        }
        RandomAccessFile raf = new RandomAccessFile("data3.txt","rw");
        byte[] bytes = next.getBytes();
        raf.write(bytes);
    }
}
