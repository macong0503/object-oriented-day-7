package com.hqyj.mc.Test.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/*
java.io.OutputStream
    java.io.FilterOutputStream
        java.io.PrintStream
特点：
1.只负责数据的输出，不负责数据的读取
2.与其他流不同，它不会抛出IOException
3.特有的方法：print(),println()

注意：
使用继承自父类中的write方法，那么它查看数据的时候会自动查看编码表，97-a
使用自己特有的print(),println()方法，它写入的数据会原样写入，97-97
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("print.txt");
        ps.write(97);
        ps.println(97);
        ps.println(97);
        ps.println("abc");
        ps.print(true);
        ps.close();
    }
}
