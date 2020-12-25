package com.px.BRW;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 字符缓冲输出流
 */
public class BRW2 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("fis2.txt"),"UTF-8"));
        bw.write("你好");
        bw.write("呀呀呀");
        bw.write("哦哦哦");
        bw.close();
    }
}
