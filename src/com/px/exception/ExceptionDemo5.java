package com.px.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 捕获异常的时候要从小到大去捕获异常
 * 一个try可以对应多个catch
 */
public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("t.txt");
        }catch (FileNotFoundException e){
            System.out.println("文件找不到");
        }catch (IOException e){
            System.out.println("我是IO异常");
        }catch (Exception e){
            System.out.println("我是最大的异常");
        }
    }
}
