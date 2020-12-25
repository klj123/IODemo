package com.px.ftestFile;

import java.io.File;

public class TestFile6 {
    /**
     * 通过递归算法对多级目录进行删除
     */
    public static void main(String[] args) {
        File file = new File("a");
//        boolean mkdirs = file.mkdirs();
//        System.out.println("是否创建了多级目录："+mkdirs);
        deleteDir(file);
    }
    public static void deleteDir(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                deleteDir(file1);
            }
        }
        file.delete();
    }
}
