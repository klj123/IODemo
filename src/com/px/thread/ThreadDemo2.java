package com.px.thread;

//线程的第二种创建方式，实现Runnable接口
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable mythread1 = new MyThread3();
        Thread thread1 = new Thread(mythread1);
        Runnable mythread2 = new MyThread4();
        Thread thread2 = new Thread(mythread2);
        thread1.start();
        thread2.start();
    }
}
class MyThread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("中"+i);
        }
    }
}
class MyThread4 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("不中"+i);
        }
    }
}
