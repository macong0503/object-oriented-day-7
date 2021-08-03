package com.hqyj.mc.Test.Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
java.io.Reader
    java.io.BufferedReader
定义一些子类共性的成员方法：
public int read()throws IOException
spublic int read(char[] cbuf)throws IOException将字符读入数组。

java.io.BufferedReader
构造方法：
public BufferedReader(Reader in)创建使用默认大小的输入缓冲区的缓冲字符输入流。
public BufferedReader(Reader in,int sz)创建使用指定大小的输入缓冲区的缓冲字符输入流。
特有的方法：
public String readLine()throws IOException读一行文字。
 */
public class BufferedReaderDemo03 {
    public static void main(String[] args) {

            try {
                BufferedReader br = new BufferedReader(new FileReader("b.txt"));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
