package com.zgw.d8_interface_demo;

import java.util.ArrayList;

public class ClassManage {
    private ArrayList<Student> students = new ArrayList<>();
    // private StudentOperator studentOperator = new StudentOperatorImpl();
    private StudentOperator studentOperator = new StudentOperatorImpl2();

    public ClassManage() {
        students.add(new Student("小帅", '女', 99));
        students.add(new Student("小美", '男', 77));
        students.add(new Student("小高", '女', 55));
        students.add(new Student("小矮", '男', 33));
    }

    // 打印全班学生的信息
    public void printInfo() {
        studentOperator.printInfo(students);
    }

    // 打印全班学生的平均分
    public void printScore() {
        studentOperator.printAverageScore(students);
    }
}
