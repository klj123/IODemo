package com.px.io;

import java.io.*;

/**
 * IO流字节流的顶级父类
 * InputStream和OutputStream。他们是抽象类
 * 使用字节流传输，低八位有效
 * 对应的实现的子类是FileInputStream、FileOutputStream
 * FileInputStream（File file，boolean append）
 * file文件，append true或false；true：追加，默认为false
 * FileInputStream（String path，boolean append）
 * path：文件路路径
 * 读进来，写出去
 */
public class FIOSDemo1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("os2.txt",true);
        InputStream is = new FileInputStream("os1.txt");
//必须通过字节进行传输才会在文件中显示为输入的字符，仅为输入的是以低8位有效
//        os.write("123".getBytes());
//        如何让输入的值仍然是自己输入的内容呢？
//        只能同过字节传输，把自己的要写入的内容转换为字节
//        os.write("123".getBytes());
//        String s = is.toString();
//        byte[] bytes = s.getBytes();
//        System.out.println("有多少个字节："+is.read(bytes));
//        上面的操作获取到的是指针的位置
//        下面的操作时获取到文档的结束
//        System.out.println(is.read());
        int d = 0;
        while ((d = is.read()) != -1){
            os.write(d);
        }
        os.close();
        is.close();
    }
}
