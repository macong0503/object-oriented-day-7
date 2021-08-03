package com.hqyj.mc.Test.Buffered;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
            String line;
            while ((line = br.readLine()) != null){
                String[] s = line.split("\\.");
                map.put(s[0],s[1]);
            }
            Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                String s = map.get(entry.getKey());
                bw.write(entry.getKey()+"."+s);
                bw.newLine();
            }
            bw.flush();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
