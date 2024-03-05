package com.zgw.object;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "小美";
        stu.chinese = 100;
        stu.math = 60;
        stu.printTotalScore();
        stu.printAverageScore();

        Student stu2 = new Student();
        stu2.name = "小帅";
        stu2.chinese = 70;
        stu2.math = 88;
        stu2.printTotalScore();
        stu2.printAverageScore();

        System.out.println(stu);
        System.out.println(stu2);
    }
}
