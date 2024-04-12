package com.zgw.d1_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class Test1 {
    public static void main(String[] args) {
        try (Reader fr = new FileReader("io-app2/src/a1.txt");) {
//            int c;
//            while ((c = fr.read()) != -1) {
//                System.out.println((char) c);
//            }

            char[] buffer = new char[3];
            int len;
            while ((len = fr.read(buffer)) != -1) {
                System.out.print(new String(buffer,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
