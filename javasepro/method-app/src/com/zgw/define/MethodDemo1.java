package com.zgw.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 修饰符 返回值类型 方法名(形参){ return 返回值; }
        System.out.println(sum(10, 20));
    }

    public static int sum(int i1, int i2) {
        return i1 + i2;
    }
}
