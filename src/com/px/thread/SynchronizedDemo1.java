package com.px.thread;

/**
 * 多线程之间对于临界条件（公共资源）
 * 在执行的时候回出现“抢”的情况
 * 此时就会出现多线程安全问题
 * 本地锁，同步锁锁同一个对象的方法
 */
public class SynchronizedDemo1 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (true){
                    System.out.println(getName()+"抢到了"+table.getBeans());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                while (true){
                    System.out.println(getName()+"抢到了"+table.getBeans());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
class Table{
    private int beans = 20;
//synchronized 在需要同步的方法上加锁

    /**
     *
     * @return
     * 当一个方法被synchronized修饰后，该方法称为同步方法
     * 意思是说当前方法不能被两个线程及以上调用
     */
    public synchronized int getBeans() {
//        beans--;
////        主动让出cpu
//        Thread.yield();
//        需要先判断是否为0，否则会出现负值
        if (beans == 0){
            throw new RuntimeException("没有豆豆了");
        }
        return beans--;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }
}
