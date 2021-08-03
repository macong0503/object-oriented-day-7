package com.hqyj.mc.Test.Object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
序列化：将对象写入到文件中
java.io.OutputStream
    java.io.ObjectOutputStream
构造方法：
public ObjectOutputStream(OutputStream out)
                   throws IOException
特定方法：
public final void writeObject(Object obj)
                       throws IOException
 */
public class ObjectOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person.txt"));
        oos.writeObject(new Person("小胡",18));
        oos.close();
    }
}
