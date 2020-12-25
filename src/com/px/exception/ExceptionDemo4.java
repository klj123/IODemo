package com.px.exception;

/**
 * finally在catch中的return之后仍然会执行
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println(test(0));
    }
    public static int test(int a){
        try{
            int i = 1/a;
        }catch (Exception e){
            System.out.println("执行");
            return 1;
        }finally {
            System.out.println("必须执行的内容");
        }
        return 0;
    }
}
