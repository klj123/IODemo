package com.px.io;

import java.io.*;

public class FIOSDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("os1.txt"));
        int d = 0;
        while ((d = bis.read()) != -1){
            System.out.println(d);
        }
    }
}
