package com.zgw.d2_buffereds_stream;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("io-app2/src/a9.txt");
                Reader isr = new InputStreamReader(is, "GBK");
                BufferedReader br = new BufferedReader(isr);

        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
