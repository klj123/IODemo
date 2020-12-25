package com.px.ftestFile;

import java.io.File;

/**
 * 删除多级目录
 */
public class TestFile4 {
    public static void main(String[] args) {
        File file = new File("a");
        deleteDir(file);
    }
    public static void deleteDir(File file){
/**
 * 大体的删除多级目录的思路
 * 就是判断当前目录有没有子目录，有子目录就继续遍历
 * 如果没有子目录就分为文件和目录，文件肯定没有子目录，直接删除，目录下面没有子目录就执行子目录
 * 与当前的子目录同级的文件或文件夹全都进行判断，就是按照上述判断依据，在当前目录下没有文件之后
 * 再取判断父目录以及其同级目录，知道顶级目录删除掉之后，才算是多级目录的删除工作结束啦
 */
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                deleteDir(file1);
            }
        }
        //可以删除一级目录
        file.delete();
    }
}
