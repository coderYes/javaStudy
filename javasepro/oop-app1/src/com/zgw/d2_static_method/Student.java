package com.zgw.d2_static_method;

public class Student {
    double score;

    public static void printHelloWorld() {
        System.out.println("hello world");
    }

    public void printPass() {
        System.out.println("成绩：" + (score >= 60 ? "及格" : "不及格"));
    }
}
