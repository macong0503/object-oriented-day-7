package com.hqyj.mc.Test.Buffered;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            BufferedInputStream br = new BufferedInputStream(new FileInputStream("D:\\1.jpg"));
            BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("F:\\1.jpg"));
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=br.read(bytes))!=-1){
                bw.write(bytes,0,len);
            }
            bw.flush();
            bw.close();
            br.close();
            long end = System.currentTimeMillis();
            System.out.println("共用时："+(end-start)+"毫秒");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
