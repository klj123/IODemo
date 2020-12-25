package com.px.thread;

/**
 * synchronized修饰的是两段代码，但是锁的对象是相同的
 * 那么这两段代码就是互斥的
 *
 * 整理：
 * 同一个对象的相同方法加锁实现同步锁
 * 不同对象的静态方法加锁实现同步锁
 * 同一个对象不同方法加锁实现互斥锁
 */
public class SynchronizedDemo4 {
    public static void main(String[] args) {
        Food food = new Food();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                food.methodA();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                food.methodB();
            }
        };
        thread1.start();
        thread2.start();
    }
}
//当在两个方法前都加上synchronized，有什么现象，就是会出现互斥
class Food{
    public synchronized void methodA(){
        Thread thread = Thread.currentThread();
        System.out.println(thread+"执行A方法");
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(thread+"执行A方法完毕");
    }
    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread+"执行B方法");
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(thread+"执行B方法完毕");
    }
}
