package com.px.exception;

public class DefinedException extends Exception {
//    这时构造函数
    public DefinedException(String message) {
//        指向父类，如果传入message，会把这个message传给父类
        super(message);
    }
}
