package com.hqyj.mc.Test.InputStreamReader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
java.io.Reader
java.io.InputStreamReader

public InputStreamReader(InputStream in,String charsetName)throws UnsupportedEncodingException
创建一个使用命名字符集的InputStreamReader。
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {
        UTFRead();
    }
    public static void UTFRead() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("UTF_8.txt"),"UTF-8");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
        }
    }
}
