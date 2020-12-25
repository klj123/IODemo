package com.px.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池要解决的问题
 * 对于短期异步任务的线程会出现频繁的创建和销毁,
 * 极大的消耗了系统资源
 * 解决这个问题就需要使用线程池
 * 线程池的作用：
 * 1.控制线程数量
 * 2.重用线程
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        //指定十个任务
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Thread t1 = Thread.currentThread();
                    System.out.println(t1+"在执行任务");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(t1+"执行任务完毕");
                }
            };
            //一个线程执行完了之后就开启下一个线程
            System.out.println("指派新的任务");
            threadPool.execute(runnable);
        }
        /**
         * shutdownNow立即停止
         * 就是说执行到这里之后，虽然有些线程中的任务没有
         * 执行完成，也要强制关闭池子，拿走线程就相当于
         * 不让你执行任务了
         * shutdown 等全部任务执行完成之后，再关闭线程池
         */
        System.out.println("立即停止线程");
        //shutdownNow  会出现异常（java.lang.InterruptedException）
        //interrupted  打断
//        threadPool.shutdownNow();//立即停止线程
        threadPool.shutdown();//当现行任务执行完之后再关闭线程池，不会出现上述异常
    }
}
