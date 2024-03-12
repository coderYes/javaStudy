package com.zgw.d5_abstract_template;

public class Test {
    public static void main(String[] args) {
        // 抽象类应用场景之一：经常用来设计模板方法设计模式
        // 场景：学生老师都要写一篇作文，第一段和最后一段一样，正文自由发挥

        Teacher teacher = new Teacher();
        teacher.write();

        Student student = new Student();
        student.write();
    }
}
