package com.zgw.d2_regex;

public class RegexTest1 {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("0"));
        System.out.println(checkQQ("13321"));
        System.out.println(checkQQ("1332113321133211332113321"));
        System.out.println(checkQQ("a1332113"));
        System.out.println(checkQQ("13267603027"));
        System.out.println("--------------------------");
        System.out.println(checkQQ2(null));
        System.out.println(checkQQ2("0"));
        System.out.println(checkQQ2("13321"));
        System.out.println(checkQQ2("1332113321133211332113321"));
        System.out.println(checkQQ2("a1332113"));
        System.out.println(checkQQ2("13267603027"));
    }

    public static boolean checkQQ(String qq) {
        // 1.判断是否为null/checkQQ2/长度小于6大于20
        if (qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            // 不是数字
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    // 正则匹配
    public static boolean checkQQ2(String qq) {
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }
}
