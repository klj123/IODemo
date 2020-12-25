package com.px.thread;

/**
 * 守护线程又称为后台线程，守护前台线程
 * 作用就是所有前台线程执行完成之后，守护线程终止
 * GC就属于后台线程
 */
public class ThreadAPI3 {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            @Override
            public void run() {
                System.out.println("you jump,I jump!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("扑通，掉到水里！");
            }
        };
        Thread jack = new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("rose，love you");
                    System.out.println("don't jump");
                }
            }
        };
        jack.setDaemon(true);  //将jack设置为后台线程
        rose.start();
        jack.start();
        System.out.println("故事结束！");
    }
}

