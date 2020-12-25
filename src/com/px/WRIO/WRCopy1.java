package com.px.WRIO;

import java.io.*;

/**
 * 使用WR实现音频的复制
 */
public class WRCopy1 {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\EDZ\\Desktop\\运行时遇到的问题.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw1.txt"),"UTF-8");
        char[] buffer = new char[10*1024];
        int d = 0;
        long start = System.currentTimeMillis();
        while ((d = isr.read(buffer)) != -1){
            osw.write(buffer,0,d);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
        isr.close();
        osw.close();
    }
}
