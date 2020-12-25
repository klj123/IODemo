package com.px.thread;

/**
 * volatile
 * 保证数据可见性不保证原子性操作
 * 是一种轻量级的锁，一般用来修饰成员状态（资源释放）
 */
public class volatileDemo1 {
    public static void main(String[] args) {
        Foot foot = new Foot();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (foot.getFlag()){
                    System.out.println("执行死循环");
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                foot.setFlag();
                System.out.println("停止死循环");
            }
        };
        thread2.start();
        thread1.start();

    }
}
class Foot{
    private volatile boolean flag = true;
    public boolean getFlag(){
        return flag;
    }
    public void setFlag(){
        this.flag = false;
    }
}
