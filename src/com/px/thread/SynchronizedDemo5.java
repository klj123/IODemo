package com.px.thread;

/**
 * join：让别人等待，自己执行完之后两者一起，可以用来阻塞同步
 * 等待机制只能保证同步，不能保证原子性操作
 */
public class SynchronizedDemo5 {
    //    图片先下载再预览
    public static void main(String[] args) {
        Photo photo = new Photo();
        Thread download = new Thread() {
            @Override
            public void run() {
                photo.download();
                System.out.println("图片下载完毕");
            }
        };
        Thread show = new Thread() {
            @Override
            public void run() {
                photo.show();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("图片展示完成");
            }
        };
        download.start();
        try {
            download.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        show.start();
    }
}
class Photo{
    public void download(){
        Thread thread = Thread.currentThread();
        System.out.println(thread+"正在下载");
        for (int i=0; i<100; i++){
            System.out.println("文件下载："+i+"%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void show(){
        Thread thread = Thread.currentThread();
        System.out.println(thread+"正在执行图片展示");
    }
}
