package com.zgw.d1_file;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
        // 1.创建一个新文件
        File f1 = new File("C:\\Users\\cxd\\Desktop\\aaauuu.txt");
        System.out.println(f1.createNewFile());

        // 2.创建一个文件夹(只能创建一级文件夹)
        File f2 = new File("C:\\Users\\cxd\\Desktop\\sdlkjg");
        System.out.println(f2.mkdir());

        // 3.创建多级文件夹
        File f3 = new File("C:\\Users\\cxd\\Desktop\\aaa\\bbb\\ccc");
        System.out.println(f3.mkdirs());

        // 4.删除文件（不能删除非空文件夹）
        System.out.println(f1.delete());
        System.out.println(f2.delete());

    }
}
