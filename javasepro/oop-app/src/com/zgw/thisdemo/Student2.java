package com.zgw.thisdemo;

public class Student2 {
    String name;
    double score;

    public void printThis() {
        System.out.println(this);
    }

    /**
     * 无参构造器
     */
    public Student2() {
        System.out.println("无参构造器被触发了");
    }

    /**
     * 有参构造器
     */
    public Student2(String name, double score) {
        System.out.println("有参构造器被触发了");
        this.name = name;
        this.score = score;
    }

}
