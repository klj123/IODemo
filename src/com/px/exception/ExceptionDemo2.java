package com.px.exception;

import java.io.*;

/**
 * 异常的补偿机制 throw
 */
public class ExceptionDemo2 {
//    抛出的异常给了JVM
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("demo.txt");
        int read = fis.read();
        System.out.println(read);
    }
}
