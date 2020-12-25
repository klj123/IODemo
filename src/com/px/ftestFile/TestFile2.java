package com.px.ftestFile;

import java.io.File;

/**
 * 文件的增删
 */
public class TestFile2 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        if (file.isDirectory()){
            boolean delete = file.delete();
            System.out.println("删除了当前文件吗？"+delete);
        }else {
            boolean mkdir = file.mkdir();
            System.out.println("创建了文件吗？"+mkdir);
        }
    }
}
