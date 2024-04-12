package com.zgw.d1_file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\cxd\\Desktop\\project\\day111");

        File[] videos = dir.listFiles();
        for (File video : videos) {
            String name = video.getName();
            System.out.println(name.contains("340"));
        }
    }
}
