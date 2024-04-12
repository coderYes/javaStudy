package com.zgw.d3_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1.创建文件字节管道，与源文件接通
        InputStream is = new FileInputStream(new File("C:\\Users\\cxd\\Desktop\\project\\javaStudy\\javasepro\\file-io-app\\src\\abc.txt"));

        // 2.开始读取文件的字节数据
        int b1 = is.read();
        System.out.println((char)b1);
        int b2 = is.read();
        System.out.println((char)b2);
        int b3 = is.read();
        System.out.println((char)b3);

        // 释放系统资源
        is.close();
    }
}
