package com.px.ftestFile;

import java.io.File;

/**
 * 创建多级目录
 */
public class TestFile3 {
    public static void main(String[] args) {
        File file = new File("a/b/c");
        if (!file.isDirectory()){
            boolean mkdirs = file.mkdirs();
            System.out.println("文件目录创建了吗？"+mkdirs);
        }
    }
}
