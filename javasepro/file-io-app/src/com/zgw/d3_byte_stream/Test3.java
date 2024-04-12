package com.zgw.d3_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("file-io-app/src/abc3.txt");

        File f = new File("file-io-app/src/abc2.txt");
        long size = f.length();
        byte[] buffer = new byte[(int) size];

        System.out.println(is.read(buffer));
        System.out.println(size);
        System.out.println(new String(buffer));
    }
}
