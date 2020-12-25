package com.px.file;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型
 * 读writeXxx()
 * 写readXxx()
 */
public class RAFDemo4 {
    public static void main(String[] args) throws FileNotFoundException {
        RandomAccessFile raf = new RandomAccessFile("data2","rw");

    }
}
