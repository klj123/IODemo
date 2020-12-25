package com.px.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 高级流：缓冲流
 * 普通流：正常的几个流
 * 对象流
 * ObjectInputStream
 * ObjectOutputStream
 * 序列化：将对象转化为二进制字节
 * 反序列化：将二进制字节转化为对象
 * 关闭高级流就相当于关闭低级流了
 * 在网络中传输对象必须要实现序列化
 * 什么叫做序列化的性能：序列化之后文件的大小
 * 就是压缩比例，压缩比例越大越好
 * Serializable
 * java序列化工具：Serializable
 * goole序列化工具：protobuff
 * hessian序列化工具
 * thrift序列化工具
 */
public class FIOSDemo5 {
    public static void main(String[] args) throws IOException {
        Student student = new Student();
        student.setName("zs");
        student.setSex("F");
        student.setAge(12);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
//        专属api，将对象序列化到文件中
        oos.writeObject(student);
//        关闭高级流就可以关闭低级流了
        oos.close();
    }
}
