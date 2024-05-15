package com.zgw.demo3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        try (
                PrintStream ps = new PrintStream("javasepro-test\\src\\系统菜单2.txt");
                BufferedReader br = new BufferedReader(new FileReader("javasepro-test\\src\\系统菜单.txt"));
        ) {
            // 1.使用流读取文件中的全部数据


            // 2.按照行读取
            List<String> menus = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                menus.add(line);
            }

            // 3.对菜单进行排序
            Collections.sort(menus);

            // 4.遍历集合
            for (String menu : menus) {
                String[] menusNumAndName = menu.split("-");
                System.out.println(menusNumAndName[0].length() == 4 ? menusNumAndName[1] : "\t" + menusNumAndName[1]);
            }

            // 5.写出菜单到新文件

            for (String menu : menus) {
                ps.println(menu);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
