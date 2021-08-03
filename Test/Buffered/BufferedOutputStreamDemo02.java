package com.hqyj.mc.Test.Buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
java.io.OutputStream
    java.io.FilterOutputStream
        java.io.BufferedOutputStream
此类是一个抽象类，表示输出字节流的所有类的超类
定义一些子类共性的成员方法：
public void close()throws IOException关闭此输出流并释放与此流相关联的任何系统资源
public void flush()throws IOException刷新此输出流并强制任何缓冲的输出字节被写出。
public void write(byte[] b)throws IOException将b.length字节从指定的字节数组写入此输出流。
public void write(byte[] b,int off,int len)throws IOException从指定的字节数组写入len字节，从偏移off开始输出到此输出流。
public abstract void write(int b)throws IOException将指定的字节写入此输出流。

java.io.BufferedOutputStream
构造方法：
public BufferedOutputStream(OutputStream out)
创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
public BufferedOutputStream(OutputStream out,int size)
创建一个新的缓冲输出流，以便以指定的缓冲区大小将数据写入指定的底层输出流。
 */
public class BufferedOutputStreamDemo02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("b.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            fos.write("我把数据放在缓冲区".getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
