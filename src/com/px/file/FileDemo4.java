package com.px.file;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("d");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file.getName());
        }
    }
}
