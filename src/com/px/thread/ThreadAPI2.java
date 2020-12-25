package com.px.thread;
//设置线程优先级
public class ThreadAPI2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+"在执行run方法");
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+"在执行run方法");
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+"在执行run方法");
            }
        };
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
