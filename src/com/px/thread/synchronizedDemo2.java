package com.px.thread;

/**
 * 缩小锁的范围可以在保证并发安全的前提下
 * 提高并发效率
 * 挑选一股和结账走人可以并发
 * 试衣服必须同步
 * 可以使用同步代码块进行局部的上锁，不局限于方法
 * 对于方法、类、成员变量都行
 */
public class synchronizedDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread person1 = new Thread(){
            @Override
            public void run() {
                shop.buy();
            }
        };
        Thread person2 = new Thread(){
            @Override
            public void run() {
                shop.buy();
            }
        };
        person1.start();
        person2.start();
    }
}
class Shop{
    public void buy(){
        try {
//          哪个线程执行了
            Thread thread = Thread.currentThread();
            System.out.println(thread+"选衣服");
            Thread.sleep(5000);
            //this是指代当前对象，并且在同一个对象中说同步才有意义
            synchronized (this){
                System.out.println(thread+"正在试衣服");
                Thread.sleep(5000);
            }
            System.out.println(thread+"结账走人");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
