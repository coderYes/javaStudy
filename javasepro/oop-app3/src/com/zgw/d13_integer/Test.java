package com.zgw.d13_integer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Integer a1 = Integer.valueOf(12);
        System.out.println(a1);

        // 自动装箱：可以自动把基本类型的数据转换成对象
        Integer a2 = 12;

        // 自动拆箱，可以自动把包装类型的对象转换成对应的基本数据类型
        int a3 = a2;

        // 泛型和集合不支持基本数据类型，只支持引用数据类型
        // ArrayList<int> list = new ArrayList<>(); // 报错，不支持
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // 自动装箱
        list.add(11);
        int rs = list.get(0);// 自动拆箱
        System.out.println(rs);

        System.out.println("----------------------------------");

        // 基本类型数据转换成字符串
        Integer a = 23;
        String s1 = Integer.toString(a); // "23"
        System.out.println(s1 + 1); // "231"

        String s2 = a.toString();
        System.out.println(s2 + 1); // "231"

        String s3 = a + "";
        System.out.println(s3 + 1); // "231"

        // 把字符串类型数值转换成对应的基本类型
        String ageStr = "18";
        int age1 = Integer.parseInt(ageStr);
        System.out.println(age1 + 1); // 19

        String scoreStr = "99.5";
        double score = Double.parseDouble(scoreStr);
        System.out.println(score);

        int age2 = Integer.valueOf(ageStr);
        double score2 = Double.valueOf(scoreStr);
        System.out.println(age2);
        System.out.println(score2);

    }
}
