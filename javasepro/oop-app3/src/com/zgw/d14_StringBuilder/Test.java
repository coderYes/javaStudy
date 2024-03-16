package com.zgw.d14_StringBuilder;

public class Test {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");

        // 1.拼接内容
        s.append(12);
        System.out.println(s); // hello12
        s.append("world");
        System.out.println(s); // hello12world
        s.append(true);
        System.out.println(s); // hello12worldtrue

        // 支持链式
        s.append(1).append(2).append(3);
        System.out.println(s); // hello12worldtrue123

        // 2.反转操作
        s.reverse();
        System.out.println(s); // 321eurtdlrow21olleh

        // 3.反转字符串长度
        System.out.println(s.length());

        // 4.把StringBuilder对象转换成String类型
        String s2 = s.toString();
        System.out.println(s2); // 321eurtdlrow21olleh
    }
}
