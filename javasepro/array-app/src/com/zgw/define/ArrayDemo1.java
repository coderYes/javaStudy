package com.zgw.define;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 静态初始化数组
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        double[] scope = {60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(scope));

        // 动态初始化数组
        int[] age = new int[10];
        System.out.println(Arrays.toString(age));
        int[] age2 = new int[]{10,20,30};
        System.out.println(Arrays.toString(age2));
    }
}
