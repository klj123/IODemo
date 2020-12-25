package com.px.thread;

/**
 * Synchronized锁静态方法
 */
public class SynchronizedDemo3 {
    public static void main(String[] args) {
        SynchronizedDemo3 syn1 = new SynchronizedDemo3();
        SynchronizedDemo3 syn2 = new SynchronizedDemo3();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                syn1.dosome();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                syn2.dosome();
            }
        };
        thread1.start();
        thread2.start();
    }
    /**
     * 动态成员方法上使用synchronized后，锁对象为this，
     * 即方法所属对象
     * 静态成员方法上使用synchronized后，锁对象为当前类的类对象
     * 类对象即class类的一个实例
     * 当jvm加载我们使用的一个类时，首先读取该类的class
     * 字节码文件，探后创建一个class类的实例对象，静态
     * 方法上锁，就是该对象所有同步的静态方法，一定是对
     * 所有对象都具有同步效果
     */
    public synchronized static void dosome(){
        Thread thread = Thread.currentThread();
        System.out.println(thread+"正在执行dosome方法");
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(thread+"执行dosome方法完毕");
    }
}
