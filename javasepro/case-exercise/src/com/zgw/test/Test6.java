package com.zgw.test;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(search(101, 200));
    }

    public static int search(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
