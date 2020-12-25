package com.px.exception;

/**
 * 方法重写的时候，子类不允许抛出比父类更大的异常
 * 即可以小于等于父类的异常
 * 作用域也是这样，修饰符只能小于等于父类的作用域
 * 返回值也是这样，返回值可以泛化
 * 比如Number，Integer，Double
 * 子类的返回值不允许比父类的返回值更大
 * 可以向小的范围泛化，基本值时不可以泛化
 * Integer不是long的父类，
 * long继承Number
 * Integer继承Number
 */
public class ExceptionDemo3 {
}
