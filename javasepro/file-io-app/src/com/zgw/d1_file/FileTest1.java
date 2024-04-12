package com.zgw.d1_file;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        // 1.创建一个file对象
        File f1 = new File("C:\\Users\\cxd\\Desktop\\open-cover.png");
        System.out.println(f1.getName());
        System.out.println(f1.length());

        // 2.file对象可以指代一个不存在的文件路径
        File f2 = new File("C:\\Users\\cxd\\Desktop\\aaaaaaaaaaa.png");
        System.out.println(f2.length());
        System.out.println(f2.exists()); // 判断文件是否存在

        // 3.获取模块中的文件
        // 绝对路径
        File f3 = new File("C:\\Users\\cxd\\Desktop\\project\\javaStudy\\javasepro\\file-io-app\\src\\abc.txt");
        // 相对路径,不带盘符，默认是去工程下寻找文件
        File f4 = new File("file-io-app\\src\\abc.txt");
        System.out.println(f4.length());
    }
}
