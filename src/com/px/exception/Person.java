package com.px.exception;

public class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws DefinedException {
        if (age < 0){
            throw new DefinedException("年龄输入异常");
        }
        this.age = age;
    }
}
