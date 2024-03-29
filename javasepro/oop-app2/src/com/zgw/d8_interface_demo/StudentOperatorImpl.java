package com.zgw.d8_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl implements StudentOperator {
    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("======全班学生信息======");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + "性别：" + s.getSex() + "成绩：" + s.getScore());
        }
        System.out.println("====================");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore = 0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
        }
        System.out.println("平均分：" + (allScore) / students.size());
    }
}
