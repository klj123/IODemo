package com.px.ftestFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 对文件的读写
 */
public class TestFile7 {
    public static void main(String[] args) throws IOException {
//        为什么这条语句会抛出异常？有可能文件不存在，没办法访问
        RandomAccessFile raf = new RandomAccessFile("data.txt","r");
        RandomAccessFile raf1 = new RandomAccessFile("data2.txt","rw");
        long start = System.currentTimeMillis();
        int d = 0;
        while ((d = raf.read()) != -1){
            raf1.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }
}
