package com.px.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileContext {
    public static void main(String[] args) throws IOException {
//        RandomAccessFile是只读本地的文件，网络中比如qq消息是无法读取的
//        这时与IO流最大的不同
//        r表示只读
//        只读操作（r）：提前创建文件
//        读写模式（rw）：有没有文件都会写，没有文件会自动创建一个文件，然后再进行写操作
//        new RandomAccessFile（r）抛异常，就是文件有可能没有
        RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");
//        抛异常原因：赋予文件的权限是只读，那么就不能写
//        raf.write(1);
        String str = "你好呀";
        raf.write(str.getBytes());
    }
}
