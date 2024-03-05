package com.zgw.variable;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(5 / 2); // 2 两个整数相除结果还是整数
        System.out.println(5.0 / 2); // 2 两个整数相除结果还是整数
        int i = 5;
        int j = 2;
        System.out.println(1.0 * i / j); // 2.5

        // 符号+可以做连接符
        System.out.println("今天赚了" + 250);
    }
}
