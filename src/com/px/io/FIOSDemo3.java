package com.px.io;

import java.io.*;

/**
 * 缓冲，只是对输入输出流进行了修饰，可以提高存取效率，不用把时间都浪费在取数据和放数据以及传输的过程上
 * BufferedInputStream
 * BufferedOutputStream
 */
public class FIOSDemo3 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("os1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        bos.write(123);
        bos.close();
    }
}
