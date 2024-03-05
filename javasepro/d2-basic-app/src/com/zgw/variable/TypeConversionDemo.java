package com.zgw.variable;

public class TypeConversionDemo {
    public static void main(String[] args) {
        byte a = 12; // 8位 00001100
        int b = a; // 32位 0...00001100
        System.out.println(a);
        System.out.println(b);
    }
}
