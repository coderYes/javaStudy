package com.zgw.thisdemo;

import com.zgw.object.Student;

public class Test {
    public static void main(String[] args) {
        Student2 s1 = new Student2("aaa", 99);
        Student2 s2 = new Student2("bbb", 99);
        Student2 s3 = new Student2("ccc", 99);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}
