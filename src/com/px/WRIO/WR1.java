package com.px.WRIO;

import java.io.*;

/**
 * Reader
 * writer
 * 字符流是按字符传输，所以是低16有效
 * 文本文件建议使用字符流读取
 * 字符流是一种高级流，必须依赖字节流
 * OutputStreamWriter其实是桥接流或转换流
 * 将字节流转换为字符流
 * InputStreamReader
 * OutputStreamWriter
 */
public class WR1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");
        osw.write(123);
        osw.close();
    }
}
