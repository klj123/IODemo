package com.px.exception;

/**
 * 为了实现程序出现异常之后，可以继续执行接下来的代码
 * 就需要对异常进行处理
 * 1.try catch 2.throw（抛出时，需要先声明也就是throws）
 * 异常分为:运行时异常（unchecked Exception）和非运行时异常（检查时异常，编译时有问题）
 * 运行时异常：逻辑表达有误
 * 非运行时异常：语法有误
 * 五大运行时异常：
 * 1.空指针异常
 * 2.下标越界异常
 * 3.数字格式异常
 * 4.类型转换胃肠
 * 5.EOFException读文件时末尾异常
 * 6.ArithmeticException 算数异常
 * 常见的非运行时异常：
 * 1.fileNotFoundException
 * 2.IOException
 * 3.SQLException
 * 异常机制补偿：finally
 * 假如finally在return的后面也是要执行
 * 异常是要捕获还是要throws
 * 1.如果是一个框架或者是一个工具类就要扔出去也就是使用throws
 * 2.如果是自己写代码要尽量去捕获
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("程序正常运行");
        try {
            int a = 1/0;
        }catch (Exception e){
            System.out.println("异常出现");
        }finally {
            System.out.println("程序异常后");
        }
    }
}
