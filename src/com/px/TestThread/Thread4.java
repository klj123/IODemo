package com.px.TestThread;

/**
 * 属于后台线程的一种机制
 */
public class Thread4 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (foo.getFlag()){
                    System.out.println("一直循环");
                }
            }
        };
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("中断训话");
                foo.setFlag();
            }
        };
        thread.start();
        thread1.start();
    }
}
class Foo{
    private volatile boolean flag = true;
    public boolean getFlag(){
        return flag;
    }
    public void setFlag(){
        flag = false;
    }
}