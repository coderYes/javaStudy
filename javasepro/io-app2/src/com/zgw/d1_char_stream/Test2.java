package com.zgw.d1_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2 {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter("io-app2/src/a2.txt");) {
            fw.write('a');
            fw.write(97);
            fw.write('b');

            fw.write("aaabbbccc", 0, 6);

            char[] buffer = {'在', 'b', 'w', 'b'};
            fw.write(buffer);

            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
