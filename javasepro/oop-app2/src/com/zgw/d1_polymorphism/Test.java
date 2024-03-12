package com.zgw.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 对象多态
        People p1 = new Teacher();
        p1.run();

        People p2 = new Student();
        p2.run();

        // 变量不多态
        System.out.println(p1.name);
        System.out.println(p2.name);

        // 多态下无法调用子类的方法
        // p1.teach();
        // 强制类型转换
        Teacher s1 = (Teacher) p1;
        s1.teach();

        // 运行时出现了ClassCastException，强制转换可能存在问题
        // Teacher s2 = (Teacher) p2;
        // s2.teach();

        // 强制转换前使用instanceof判断一下再转换
        if (p2 instanceof Teacher) {
            Teacher s2 = (Teacher) p2;
            s2.teach();
        } else {
            System.out.println("强制转换失败");
        }

    }
}
