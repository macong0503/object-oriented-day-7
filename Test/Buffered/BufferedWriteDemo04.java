package com.hqyj.mc.Test.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
java.io.Writer
    java.io.BufferedWriter
定义一些子类共性的成员方法：
public void write(int c) throws IOException写一个字符
public void write(char[] cbuf) throws IOException写入一个字符数组。
public abstract void write(char[] cbuf,int off,int len) throws IOException写入字符数组的一部分。
public void write(String str)throws IOException写一个字符串
public void write(String str,int off,int len)throws IOException写一个字符串的一部分。
public abstract void flush()throws IOException刷新流。
public abstract void close()throws IOException关闭流，先刷新

java.io.BufferedWriter
构造方法：
public BufferedWriter(Writer out)创建使用默认大小的输出缓冲区的缓冲字符输出流。
public BufferedWriter(Writer out,int sz)创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
特有的方法：
public void newLine()throws IOException写一行行分隔符。
 */
public class BufferedWriteDemo04 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
            for (int i = 0; i < 10; i++) {
                bw.write("你好Java");
                bw.newLine();//换行
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
