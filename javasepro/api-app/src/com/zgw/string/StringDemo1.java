package com.zgw.string;

import java.util.Arrays;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "hello world";
        // 获取字符串长度
        System.out.println(s.length());
        // 提取字符串中某个索引位置的字符
        System.out.println(s.charAt(1));
        // 字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        // 字符串内容比较
        String s1 = new String("hello");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // false 大小写也验证
        System.out.println(s1.equalsIgnoreCase(s2)); // true 忽略大小写验证

        // 截取/替换字符串内容
        String s3 = "PHP is the best language";
        System.out.println(s3.substring(0, 10));
        System.out.println(s3.substring(10, s3.length()));
        System.out.println(s3.replace("best", "BEST"));
        // 检测字符串中是否包含某个关键字
        System.out.println(s3.contains("PHP"));
        // 判断字符串是否以某字符串开头
        System.out.println(s3.startsWith("P"));
        System.out.println(s3.startsWith("PH"));
        System.out.println(s3.startsWith("PHp"));
        // 分割字符串
        System.out.println(Arrays.toString(s3.split(" ")));
    }
}
