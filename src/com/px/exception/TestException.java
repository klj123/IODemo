package com.px.exception;

/**
 * 谁调用谁处理
 */
public class TestException {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-1);
        }catch (DefinedException e){
//            不写sout，就是没有把信息输出出去，肯定显示不了
            System.out.println(e.getMessage());
        }
    }
}
