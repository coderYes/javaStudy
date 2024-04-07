package com.zgw.demo5;

public class Test {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 9};
        int target = 7;
        int left = getLeftIndex(nums, target);
        int right = getRightIndex(nums, target);
        System.out.println(left);
        System.out.println(right);
    }

    public static int getLeftIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int rs = -1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else {
                rs = middle;
                end = middle - 1;
            }
        }
        return rs;
    }

    public static int getRightIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int rs = -1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else {
                rs = middle;
                start = middle + 1;
            }
        }
        return rs;
    }
}
