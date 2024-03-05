package com.zgw.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 打分需求
        System.out.println(getAverageScore(6));
    }

    public static double getAverageScore(int number) {
        int[] score = new int[number];

        // 录入分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("录入第" + (i + 1) + "个评委分数");
            int s = sc.nextInt();
            score[i] = s;
        }

        // 计算总分，最高分，最低分
        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < score.length; i++) {
            int s = score[i];
            sum += s;
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
        }

        return 1.0 * (sum - min - max) / (number - 2);
    }
}
