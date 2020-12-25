package com.px.thread;

/**
 * wait notify是联合使用，也可以实现同步阻塞，
 * 是Object的方法
 * wait线程等待，主动让出cpu，等待唤醒
 * notify唤醒等待的线程，把cpu给等待的线程
 * 先有wait再有notify
 * 与join相似
 */
public class SynchronizedDemo6 {
//    //    图片先下载再预览
//    public static void main(String[] args) {
//        Object o = new Object();
//        Photo1 photo = new Photo1();
//        Thread download = new Thread() {
//            @Override
//            public void run() {
//                photo.download();
//                System.out.println("图片下载完毕");
//            }
//        };
//        Thread show = new Thread() {
//            @Override
//            public void run() {
//                photo.show();
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("图片展示完成");
//            }
//        };
//
//        try {
//            synchronized (photo){
//                show.wait();
//                download.start();
//                show.notify();
//            }
//
//            show.start();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    private static Object obj = new Object();

    public static void main(String[] args) {
        /**
         * 图片的下载和展示
         */
        Thread download = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("图片下载了"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("图片下载完毕！");
                synchronized (obj){
                    obj.notify();
                }
            }
        };
        /**
         * 图片展示
         */
        Thread show = new Thread() {
            @Override
            public void run() {
                //当前为对象不是线程
                synchronized (obj){
                    try {
                        //使得线程进入wait阻塞等地拎一个线程唤醒
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("图片开始展示");
                System.out.println("图片展示完毕");
            }
        };
        download.start();
        show.start();
    }
}
//class Photo1{
//    public void download(){
//        Thread thread = Thread.currentThread();
//        System.out.println(thread+"正在下载");
//        for (int i=0; i<100; i++){
//            System.out.println("文件下载："+i+"%");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public void show(){
//        Thread thread = Thread.currentThread();
//        System.out.println(thread+"正在执行图片展示");
//    }
//}