package com.zgw.d3_byte_stream;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\Users\\cxd\\Desktop\\open-cover.png");
        OutputStream os = new FileOutputStream("C:\\Users\\cxd\\Desktop\\aaa\\open-cover.png");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        os.close();
        is.close();
    }
}
