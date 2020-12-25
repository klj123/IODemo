package com.px.ftestFile;

/**
 * 书写一个递归算法
 */
public class TestFile1 {
    /**
     * 递归算法要求，计算1到100的和
     */
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(sum2(100));
    }
//    正向写和反向写
//    反向a在一直减
    public static int sum(int a){
//        if (a == 1){
//            return 1;
//        }
//        return a+sum(a-1);
        return a==1?1:a+sum(a-1);
    }
//    正向，a在一直加,好像是不能实现，这可以让循环实现，循环是可以知道结果，就比如说你知道是100
//    public static int sum1(int a){
//
//        return
//    }
//    通过循环是可以实现已知的内容的遍历
    public static int sum2(int a){
        int num = 0;
        for (int i = 1; i <= a; i++) {
            num+=i;
        }
        return num;
    }
}
