package com.zgw.d1_static_demo;

public class Test {
    public static void main(String[] args) {
        // static修饰符的用法，特点
        // 直接通过类访问
        Student.name = "aaa";

        Student student = new Student();
        student.name = "bbb";

        Student student1 = new Student();
        student1.name = "ccc";
        System.out.println(student.name);
    }
}
