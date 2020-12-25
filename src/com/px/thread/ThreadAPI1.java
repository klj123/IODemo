package com.px.thread;

public class ThreadAPI1 {
    public static void main(String[] args) {
//        main也是一条线程，是一条主线程
        Thread thread = Thread.currentThread();
        System.out.println("当前线程id："+thread.getId());
        System.out.println("当前线程名字："+thread.getName());
        System.out.println("当前线程优先级："+thread.getPriority());
        System.out.println("当前线程状态："+thread.getState());
        System.out.println("当前线程是否被打断："+thread.isInterrupted());
        boolean daemon = thread.isDaemon();
        System.out.println("当前线程是不是后台线程："+daemon);
        boolean alive = thread.isAlive();
        System.out.println("当前线程能不能被激活："+alive);
    }
}
