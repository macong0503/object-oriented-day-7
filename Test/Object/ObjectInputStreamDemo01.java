package com.hqyj.mc.Test.Object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
反序列化：将对象从文件中读取出来
java.io.InputStream
java.io.ObjectInputStream

构造方法：
public ObjectInputStream(InputStream in)
                  throws IOException创建从指定的InputStream读取的ObjectInputStream。
特定方法：
public final Object readObject()
                        throws IOException,
                               ClassNotFoundException

异常：没序列化异常
Exception in thread "main" java.io.NotSerializableException: com.hqyj.demo09.Person
前提：
Person类要实现Serializable接口（序列化接口-标记型接口），启动序列化功能，不实现会报以上异常
 */
public class ObjectInputStreamDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.txt"));
        Object o = ois.readObject();
        Person p = (Person)o;
        System.out.println(p.getName()+"--"+p.getAge());
        ois.close();
    }
}
