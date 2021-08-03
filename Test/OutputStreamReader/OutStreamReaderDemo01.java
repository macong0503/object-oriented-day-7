package com.hqyj.mc.Test.OutputStreamReader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/*
java.io.Writer
java.io.OutputStreamWriter

public OutputStreamWriter(OutputStream out,
                          String charsetName)
                   throws UnsupportedEncodingException创建一个使用命名字符集的OutputStreamWriter。
 设置编码的时候，参数不区分大小写 GBK/gbk;UTF-8/utf-8
 不指定编码默认用UTF-8
 */
public class OutStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {

        gbk_read();
    }
    public static void gbk_read() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");

        osw.write("你好呀");
        osw.flush();
        osw.close();
    }
}
