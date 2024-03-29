package com.zgw.d1_algorithm;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 82));

        System.out.println(Arrays.binarySearch(arr, 81));
    }

    public static int binarySearch(int[] arr, int data) {
        // 1.定义左右两个变量
        int left = 0;
        int right = arr.length - 1;

        // 定义循环折半
        while (left <= right) {
            int middle = (left + right) / 2;
            if (data < arr[middle]) {
                right = middle - 1;
            } else if (data > arr[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
