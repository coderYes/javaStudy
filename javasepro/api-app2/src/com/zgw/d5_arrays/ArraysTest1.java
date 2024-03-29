package com.zgw.d5_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        // 1.toString返回数组内容
        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40]

        // 2.copyOfRange拷贝数组(指定范围，包前不包后)
        int[] arr2 = Arrays.copyOfRange(arr, 1, 2);
        System.out.println(Arrays.toString(arr2)); // [20]

        // 3.copyOf拷贝数组，可以执行新数组的长度
        int[] arr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr3)); // [10, 20, 30, 40, 0, 0, 0, 0, 0, 0]

        // 4.setAll把数组中原数据改为新数据存进去
        double[] prices = {99.8, 128, 100};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices)); // [79.84, 102.4, 80.0]

        // 5.sort对数组进行排序，默认升序排序
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
