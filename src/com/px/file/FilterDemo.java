package com.px.file;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器
 * 获取满足过滤条件的子项
 */
public class FilterDemo {
    public static void main(String[] args) {
//        .代表当前工程的最外层子项.idea、IODemo.iml、out、src
        File file = new File(".");
        File[] files = file.listFiles(new FileFilter() {
//            过滤方法，return true才能通过过滤器
            @Override
            public boolean accept(File pathname) {
                return false;
            }
        });
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
