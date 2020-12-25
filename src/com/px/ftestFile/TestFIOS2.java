package com.px.ftestFile;

import java.io.*;
import java.util.Scanner;

public class TestFIOS2 {
    public static void main(String[] args) throws IOException {
        InputStream iis = new FileInputStream("C:\\Users\\EDZ\\Desktop\\运行时遇到的问题.txt");
        InputStream is = new BufferedInputStream(iis);
        OutputStream oos = new FileOutputStream("os4.txt");
        OutputStream os = new BufferedOutputStream(oos);
        byte[] b = new byte[10*1024];
        int i = 0;
        while ((i = is.read()) != -1){
            is.read(b);
            os.write(b);
        }
        os.close();
        is.close();
    }
}
