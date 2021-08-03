package com.hqyj.mc.HomeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        A();
        B();

    }
    //保存验证码
    public static void A(){
        try {
            BufferedWriter bos = new BufferedWriter(new FileWriter("a.txt"));
            Scanner sc = new Scanner(System.in);
            String line;
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入第"+i+"个验证码：");
                line = sc.nextLine();
                bos.write(line);
                bos.newLine();
                bos.flush();
            }
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void B(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码：");
        String s = sc.nextLine();
        String line;
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            while ((line=br.readLine()) != null){
                list.add(line);
            }
            if (list.contains(s)){
                System.out.println("验证成功");
            }else
                System.out.println("验证失败");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
