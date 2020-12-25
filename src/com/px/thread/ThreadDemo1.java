package com.px.thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Mythread1 mythread1 = new Mythread1();
        Mythread2 mythread2 = new Mythread2();
//        start()启动线程
        mythread1.start();
        mythread2.start();
    }
}
//process进程
class Mythread1 extends Thread{
//    run方法就是线程要做的任务（事情）
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("你好"+i);
        }
    }
}
class Mythread2 extends Thread{
    //    run方法就是线程要做的任务（事情）
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("陌生人"+i);
        }
    }
}
