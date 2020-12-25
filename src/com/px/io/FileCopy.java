package com.px.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 基于IO流的文件复制
 * 带有缓冲的byte数组
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("os1.txt");
        FileOutputStream fos = new FileOutputStream("os2.txt");
        byte[] buffer = new byte[10 * 1024];
        int d = 0;
        long start = System.currentTimeMillis();
        while ((d = fis.read()) != -1){
            fos.write(buffer,0,d);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end - start));
//        关闭io释放资源
        fis.close();
        fos.close();
    }
}
