package com.px.BRW;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BRW1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("fis1.txt"), "UTF-8"));
        String b = null;
        while ((b = br.readLine()) != null){
            System.out.println(b);
        }
    }
}
