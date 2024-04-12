package com.zgw.d2_recursion;

public class RecursionTest2 {
    public static void main(String[] args) {
        // f(10)=1
        // f(x + 1) = f(x) - f(x) / 2 - 1
        // f(x) = 2f(x + 1) - 2

        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(10));
    }

    public static int f(int n) {
        if (n == 10) {
            return 1;
        } else {
            return 2 * f(n + 1) + 2;
        }
    }
}
