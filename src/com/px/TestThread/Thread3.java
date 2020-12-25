package com.px.TestThread;

//第三种-------》匿名内部类，即没有名字
public class Thread3 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("新的线程");
            }
        };
        thread.start();
    }
}
