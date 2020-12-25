package com.px.BRW;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PW1 {
    public static void main(String[] args) throws Exception {
//        autoFlush换行自动刷新，必须遇见回车也就是enter键的时候才刷新，否则不会刷新
        PrintWriter pw = new PrintWriter(new FileOutputStream("pw.txt"),true);
        pw.println("哦哦哦哦哦");
        pw.println("呀呀呀呀呀");
        pw.println("咦咦咦咦咦");
        pw.println("麻麻麻麻麻");
        pw.println("啊啊啊啊啊");
//        flush的作用：冲刷缓存区
//        也可以关流来实现文件的写
        pw.flush();
    }
}
