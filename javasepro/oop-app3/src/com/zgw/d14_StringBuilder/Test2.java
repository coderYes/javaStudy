package com.zgw.d14_StringBuilder;

public class Test2 {
    public static void main(String[] args) {
        // 拼接100w次abc

//        String rs = "";
//
//        for (int i = 0; i < 1000000; i++) {
//            rs = rs + "abc";
//        }
//        System.out.println(rs); // 等待很久,String频繁操作字符串效率非常低

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            s.append("abc");
        }
        System.out.println(s);


        // StringBuffer和StringBuilder用法一模一样
        // 但StringBuilder是线程不安全的，StringBuffer是线程安全的

        StringBuffer s2 = new StringBuffer();


    }
}
