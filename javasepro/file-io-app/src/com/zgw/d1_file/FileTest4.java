package com.zgw.d1_file;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {
        // 1.获取当前目录下所有一级文件名称到一个字符串数组中返回
        File f1 = new File("D:\\");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 2.获取当前目录下一级文件对象到一个文件对象数组中返回
        File[] file = f1.listFiles();
        for (File file1 : file) {
            System.out.println(file1);
        }
    }
}
