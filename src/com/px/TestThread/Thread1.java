package com.px.TestThread;

//创建线程的方式
//第一种-------》继承Thread类
public class Thread1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("新的线程");
    }
}
