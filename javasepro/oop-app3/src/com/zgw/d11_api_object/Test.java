package com.zgw.d11_api_object;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("小王", 23);
        System.out.println(s1.toString()); // 重写toString方法后：Student{name='小王', age=23}

        Student s2 = new Student("小王", 23);
        // 判断两个对象是否相等，根据地址判断
        System.out.println(s2.equals(s1));
        // 比较两个对象内容是否一样
        System.out.println(s2 == s1);

        Student s3 = (Student) s2.clone();
        System.out.println(s2.getName());
        System.out.println(s3.getName());
    }
}
