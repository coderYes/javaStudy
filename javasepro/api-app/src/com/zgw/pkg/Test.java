package com.zgw.pkg;


import com.zgw.pkg.itcast.Demo1;
import com.zgw.pkg.itcast2.Demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.print();

        Demo1 demo1 = new Demo1();
        demo1.print();

        // Java.lang包下的程序不需要导入，直接使用 System.in
        Scanner sc = new Scanner(System.in);

        Demo2 demo2 = new Demo2();
        demo2.print();

        com.zgw.pkg.itcast.Demo2 demo21 = new com.zgw.pkg.itcast.Demo2();
        demo21.print();
    }
}
