package com.px.file;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
//    public static int sum(int a){
//        if (a == 1){
//            return 1;
//        }
//        return a + sum(a-1);
//    }
public static int sum(int a){
    return a==1?1:a+sum(a-1);
    }
}
