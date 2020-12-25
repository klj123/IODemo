package com.px.TestThread;

public class Thread5 {
    public static void main(String[] args) {
        Goo goo = new Goo();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true){
                    //getName是一个静态方法，获取当前线程的名字
                    //输出语句中写,goo.setFlag,是会报错的，setFlag没哟返回值,有值才能输出
                    System.out.println(getName()+"抢到了"+goo.getFlag());
                    //如果不加sleep是正常，没有问题，不会出现抢的情况
                    try {
                        //sleep只是让出了cpu，但是不会让出锁，就是说拿到的资源不会释放
                        //之后sleep的线程的代码执行完之后才会释放资源
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true){
                    System.out.println(getName()+"抢到了"+goo.getFlag());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Goo{
    private int flag = 10;
    public synchronized int getFlag(){
        //如果flag先减，就会出现线程没有拿到0就往下执行，所以这时候需要加上锁
        //有时候加上锁也不可以，之后先判断是否为0，再去见才可以
        //但是没有加锁，只是先判断是否为0，好像也可以实现同步的概念
        flag--;
        if (flag == 0){
            throw new RuntimeException("没有豆豆了");
        }
        return flag;
    }
}
