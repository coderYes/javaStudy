package com.zgw.d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        // Period可以用于计算两个LocalDate对象相差的年数，月数，天数
        // 1.创建Period对象，封装两个日期对象
        LocalDate start = LocalDate.of(2029, 8, 10);
        LocalDate end = LocalDate.of(2029, 8, 15);
        Period period = Period.between(start, end);

        // 2.获取两个日期对象相差的信息
        System.out.println(period.getYears()); // 0
        System.out.println(period.getMonths()); // 0
        System.out.println(period.getDays()); // 0
    }
}
