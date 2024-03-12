package com.zgw.d2_static_method;

public class Test {
    public static void main(String[] args) {
        // 有无static修饰方法的用法

        // 类名.类方法
        Student.printHelloWorld();

        Student s = new Student();
        s.printHelloWorld();


    }
}
