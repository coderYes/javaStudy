package com.zgw.d1_parameter;

public class Test {
    public static void main(String[] args) {
        test();
        test(10);
        test(10, 20, 30);
        test(new int[]{10, 20, 30});
    }

    public static void test(int... nums) {
        System.out.println(nums.length);
    }
}
