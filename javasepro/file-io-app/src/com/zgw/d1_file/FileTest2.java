package com.zgw.d1_file;

import java.io.File;

public class FileTest2 {
    public static void main(String[] args) {
        // 1.创建一个文件对象
        File f1 = new File("C:\\Users\\cxd\\Desktop\\project\\javaStudy\\javasepro\\file-io-app\\src\\abc.txt");

        // 2.判断文件是否存在
        System.out.println(f1.exists());

        // 3.判断当前文件对象是否是文件
        System.out.println(f1.isFile());

        // 4.判断当前文件对象是否是文件夹
        System.out.println(f1.isDirectory());

        // 5.获取文件名称
        System.out.println(f1.getName());

        // 6.获取文件大小
        System.out.println(f1.length());

        // 7.获取文件最后修改时间
        System.out.println(f1.lastModified());

        // 8.获取创建文件对象时使用的路径
        System.out.println(f1.getPath());

        // 9.获取绝对路径
        System.out.println(f1.getAbsolutePath());
    }
}
