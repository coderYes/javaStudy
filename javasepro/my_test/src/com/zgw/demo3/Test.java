package com.zgw.demo3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1.找到从其实位置到目标月份的全部日子
        // 拿到起始休息日
        LocalDate startDate = LocalDate.of(2022, 2, 3);

        // 2.拿到用户查询的年份月份的最后一天
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的年份和月份，必须是2022-02月开始");
        String currentDate = sc.next() + "-01";
        LocalDate endMonthFirstDay = LocalDate.parse(currentDate);
        LocalDate endDate = LocalDate.parse(currentDate);
        // 拿到这个月份的最后一天
        endDate = endDate.plusMonths(1).minusDays(1);
        System.out.println(endDate);

        // 3.拿到休息日
        List<Day> days = new ArrayList<>();
        while (!startDate.isAfter(endDate)) {
            Day day = new Day(startDate);
            days.add(day);
            startDate = startDate.plusDays(1);

        }
        // 4.遍历是否标记休息
        for (int i = 0; i < days.size(); i += 3) {
            Day day = days.get(i);
            day.setFlag(true);
        }

        // 5.展示出当月休息日情况
        for (int i = 0; i < days.size(); i++) {
            Day day = days.get(i);
            if (day.getDate().isBefore(endMonthFirstDay)) {
                continue;
            }
            day.printInfo();
        }
    }
}
