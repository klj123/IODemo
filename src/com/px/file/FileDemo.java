package com.px.file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
//        pathname就是相对路径，相对于当前项目
//        \\支持windows，//支持linux
        File file = new File("demo.txt");
//        File.separator就可以与/或\进行动态匹配，避免不同操作系统之间的差异性
        boolean file1 = file.isFile();
        System.out.println(file1);
        System.out.println(file.getName());
        System.out.println("文件可用空间："+file.getUsableSpace());
        System.out.println("文件总共空间："+file.getTotalSpace());
        System.out.println("文件是否可读："+file.canRead());
        System.out.println("文件是否可写："+file.canWrite());
        System.out.println("文件是否可执行："+file.canExecute());
        System.out.println("文件的大小："+file.length());
    }
}
