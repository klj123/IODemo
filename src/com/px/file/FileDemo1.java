package com.px.file;

import java.io.File;
import java.io.IOException;

/**
 * 文件的创建
 * 用于创建可以注协内容的文件比如.txt文件，并不是文件夹
 * 说目录的时候，在java中大概指的是文件夹的名字
 */
public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        /**
         * 创建文件
         * 使用的路径是相对路径
         */
        File file = new File("data.txt");
        if (!file.exists()){
//            boolean表示是否创建成功
            boolean isCreate = file.createNewFile();
            System.out.println("文件是否创建成功："+isCreate);
        }else {
            /**
             * 删除文件
             */
            boolean isDelete = file.delete();
            System.out.println("文件是否删除成功："+isDelete);
        }

    }
}
