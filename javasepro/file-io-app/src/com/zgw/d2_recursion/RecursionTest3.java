package com.zgw.d2_recursion;

import java.io.File;
import java.io.IOException;

public class RecursionTest3 {
    public static void main(String[] args) throws IOException {
        searchFile(new File("C:\\Users\\cxd\\Desktop\\project"), "340--day111");
    }

    /**
     * 目录下搜索某个文件
     *
     * @param dir      目录
     * @param fileName 文件名称
     */
    public static void searchFile(File dir, String fileName) throws IOException {
        if (dir == null || !dir.exists() || dir.isFile()) return;

        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File f : files) {
                if (f.isFile()) {
                    if (f.getName().contains(fileName)) {
                        System.out.println(f.getAbsolutePath());
                        Runtime runtime = Runtime.getRuntime();
                        runtime.exec(f.getAbsolutePath());
                    }
                } else {
                    searchFile(f, fileName);
                }
            }
        }
    }
}
