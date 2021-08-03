package com.hqyj.mc.Test.Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
java.io.InputStream
    java.io.FilterInputStream
        java.io.BufferedInputStream
java.io.InputStream
此类是一个抽象类，表示输入字节流的所有类的超类
定义一些子类共性的成员方法：
public abstract int read()throws IOException从输入流读取数据的下一个字节。
public int read(byte[] b)throws IOException从输入流读取一些字节数，并将它们存储到缓冲区b 。
public int read(byte[] b,int off,int len)throws IOException从输入流读取len字节的数据到一个字节数组。

java.io.BufferedInputStream
构造方法：
public BufferedInputStream(InputStream in)
创建一个BufferedInputStream并保存其参数，输入流in供以后使用。
public BufferedInputStream(InputStream in,int size)
创建具有BufferedInputStream缓冲区大小的BufferedInputStream，并保存其参数，输入流in供以后使用。
 */
public class BufferedInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        /*int len = 0;//字节
        while ((len=bis.read()) != -1){
            System.out.println(len);
        }
        bis.close();*/

        byte[] bytes = new byte[1024];//字节
        int len = 0;//有效字节数
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes));
        }
        bis.close();
    }
}
