package com.zgw.d4_jdk8_time;

import java.time.LocalDate;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // LocalDate常用API都是处理年、月、日、星期相关的
        Date d = new Date();
//        System.out.println(d.getYear()); // 124
//        System.out.println(d.getYear() + 1900); // 正常年数

        // 获取本地日期对象
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // 1.获取日期对象中的信息
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        int dayOfWeek = ld.getDayOfWeek().getValue();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);

        // 2.直接修改某个信息:withYear，withMonth，withDayOfMonth...
        LocalDate d2 = ld.withYear(2099);
        System.out.println(d2);
        LocalDate d3 = ld.withMonth(12);
        System.out.println(d3);

        // 3.把某个信息加多少:plusYears,plusMonths...
        LocalDate d4 = ld.plusYears(2);
        System.out.println(d4);
        LocalDate d5 = ld.plusMonths(2);
        System.out.println(d5);

        // 4.把某个信息减多少：minusYears,minusMonths...
        LocalDate d6 = ld.minusYears(2);
        System.out.println(d6);
        LocalDate d7 = ld.minusMonths(2);
        System.out.println(d7);

        // 5.指定日期的localData对象: public static LocalDate of()
        LocalDate d8 = LocalDate.of(2050, 12, 12);
        System.out.println(d8);
        LocalDate d9 = LocalDate.of(2050, 12, 12);
        System.out.println(d9);

        // 6.判断两个日期对象是否相等：equals，isBefore，isAfter
        System.out.println(d8.equals(d9));
        System.out.println(d8.isBefore(ld));
        System.out.println(d8.isAfter(ld));

    }
}
