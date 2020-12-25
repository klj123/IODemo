package com.px.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIOSDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("os1.txt");
        int d = 0;
        while ((d = fis.read()) != -1){

        }
    }
}
