package com.px.ftestFile;

import java.io.*;
import java.util.Scanner;

public class TestFIOS1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String name = scanner.next();
        OutputStream os = new FileOutputStream(name,true);
        String next = scanner.next();
        //在这里用缓存去写入文件是起不到什么作用的
//        byte[] b = new byte[1024];
        os.write(next.getBytes());
        os.close();
    }
}
