package com.px.file;


import java.io.File;

/**
 * 创建单级目录，删除单级目录
 * 也就是创建文件夹
 */
public class FileDemo2 {
    public static void main(String[] args) {
        /**
         * 创建目录和删除目录
         * 创建的是多级目录，没办法把创建的多级目录直接全部删掉，需要用到递归算法
         * delete 只是删除一级目录或者是文件
         */
        File file = new File("a\\b\\c");
        if (file.isDirectory()){
            boolean delete = file.delete();
            System.out.println("删除单级目录成功"+delete);
        }else {
//            mkdir方法只能创建单级目录。如果用其创建多级目录，系统不会创建会返回false
//            mkdirs创建多级目录
            boolean mkdir = file.mkdir();
            System.out.println("创建多级目录："+mkdir);
        }
    }
}
