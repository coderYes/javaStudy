package com.zgw.d2_buffereds_stream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test5 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("io-app2/src/a9.txt"));
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
