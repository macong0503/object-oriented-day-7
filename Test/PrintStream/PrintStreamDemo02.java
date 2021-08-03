package com.hqyj.mc.Test.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/*
改变输出流的目的地（打印流的语句）
输出语句默认打印到控制台
使用System.setOut可以改变输出语句的目的地，改为参数中传递的打印流的目的地
public static void setOut(PrintStream out)重新分配“标准”输出流。
 */
public class PrintStreamDemo02 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("打印到控制台");
        PrintStream ps = new PrintStream("end.txt");
        System.setOut(ps);
        System.out.println("d打印到文件");
        ps.close();
    }
}
