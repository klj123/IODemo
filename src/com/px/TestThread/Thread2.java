package com.px.TestThread;

//第二种实现多线程的方式-----》实现Runnable接口
public class Thread2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
//        最终都是Thread类进行调用start方法
        thread.start();
    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("新的线程");
    }
}
