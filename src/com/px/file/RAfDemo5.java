package com.px.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 利用移动指针实现文件内容写入的追加
 * java.io.EOFException 文件末尾异常
 * 就是移动指针异常，你把指针移动到末尾，读的时候没有东西
 * 所以读操作会出现异常
 *
 * java.io.IOException: Negative seek offset
 *
 * 1.移动至指针文件末尾，然后再文件后面追加内容
 * 2.移动指针，把内容确定，就是说基本数据类型输入进去之后会转换为ASC编码
 * 内容不会显示为输入的内容
 * 3.在文件末尾追加内容的方式，并且用本地存储RandomAccessFile
 * 就需要先读取文件，这时指针的位置是在末尾，这样就可以在文件
 * 末尾追加内容了，不会进行内容的覆盖
 */
public class RAfDemo5 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("data3.txt","rw");
        raf.read();
        raf.writeInt(123);
        raf.close();
    }
}
