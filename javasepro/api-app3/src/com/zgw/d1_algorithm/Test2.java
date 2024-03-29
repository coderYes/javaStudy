package com.zgw.d1_algorithm;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        // 每找到一个最小值就交换，频繁交换，影响性能
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
