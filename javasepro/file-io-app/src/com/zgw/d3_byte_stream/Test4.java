package com.zgw.d3_byte_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test4 {
    public static void main(String[] args) throws Exception {
        // 创建一个字节输出流管道与目标文件接通,第二个参数设置为true则写入追加不覆盖
        OutputStream os = new FileOutputStream("file-io-app/src/abc4.txt");

        // 开始写字节数据出去
        os.write(97);
        os.write('b');
        byte[] bytes = "我是帅哥".getBytes();
        os.write(bytes);
        os.write(bytes, 6, 6);

        os.close();
    }
}
