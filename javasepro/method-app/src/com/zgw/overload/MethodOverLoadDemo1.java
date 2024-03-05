package com.zgw.overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        // 一个类中多个方法名称相同，形参不同，这些方法成为重载方法
        // 重载方法修饰符，返回值类型是否一样都无所谓
        test();
        test(10);
    }

    public static void test() {
        System.out.println("-----test------");
    }

    public static void test(int a) {
        System.out.println("-----test------" + a);
    }

    void test(double b) {
        System.out.println("-----test1------");
    }

    int test(int c, int d) {
        System.out.println("-----test1------" + c + d);
        return c + d;
    }
}
