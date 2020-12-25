package com.px.WRIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符输入流InputStreamReader
 */
public class WR2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"UTF-8");

        int read = isr.read();
        System.out.println(read);
    }
}
