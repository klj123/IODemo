package com.px.file;

import java.io.File;

/**
 * 创建和删除多级目录
 */
public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        if (file.isDirectory()){
            delDir(file);
//            boolean delete = file.delete();
//            System.out.println("是否删除了多级目录："+delete);
        }else {

//            boolean mkdirs = file.mkdir();
            boolean delete = file.delete();
            System.out.println("是否创建单级目录："+delete);
        }
    }
    public static void delDir(File file){
//        如果是单级目录，没有子目录，就可以直接删除
//        获取该目录下的子目录
//        也有可能在子目录下面有文件比如.txt文件，必须先删除文件才能删除目录
//        if (file.isFile()){
//            file.delete();
//        }else {
//            File[] files = file.listFiles();
//            if (files == null && files.length == 0){
//                file.delete();
//            }else {
//                File[] file1s = file.listFiles();
//                if (files == null && files.length == 0){
//                    file.delete();
//                }
//            }
//        }
//        使用递归算法去遍历所有的目录以及目录下面有没有文件，去删除所有目录以及目录下面的文件
        if (file.isDirectory()){
//            此时认为为多级目录，单级目录的话到下面也会删除，所以在这里不需要判断
            File[] files = file.listFiles();
            for (File file1 : files) {
//                对子项做同样的操作
                delDir(file1);
            }
        }
//        1.file是文件2.file是单级目录直接删除
        file.delete();
    }
}
