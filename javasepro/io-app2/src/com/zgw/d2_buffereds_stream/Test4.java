package com.zgw.d2_buffereds_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        try (
                // 2.创建缓冲字符输入流管道与源文件接通
                BufferedReader br = new BufferedReader(new FileReader("io-app2/src/a7.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("io-app2/src/a8.txt"))
        ) {
            // 恢复a7txt顺序到新文件中
            // 1.定义一个list集合存储每段内容
            List<String> list = new ArrayList<>();

            // 3.按照行读取每段
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            System.out.println(list);

            // 4.对list集合进行排序
            Collections.sort(list);
            System.out.println(list);

            // 5.遍历list集合，依次写出到新文件中
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
