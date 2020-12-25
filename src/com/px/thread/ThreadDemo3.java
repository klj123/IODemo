package com.px.thread;

//下面这两种都是匿名内部类来实现多线程
public class ThreadDemo3 {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("你好");
            }
        }.start();
        new Thread(){
            public void run(){
                System.out.println("呀");
            }
        }.start();
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("中");
            }
        };
        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("不中");
            }
        };
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();
    }

}
