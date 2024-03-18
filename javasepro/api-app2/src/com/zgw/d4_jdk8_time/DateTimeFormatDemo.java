package com.zgw.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        // 1.创建一个日期时间格式化器对象出来
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(formatter);

        // 2.对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now)); // 2024年03月18日 18:45:39

        // 3.另一种格式化方式
        System.out.println(now.format(formatter)); // 2024年03月18日 18:46:39

        // 4.解析时间：解析时间一般用LocalDateTime提供的解析方法来解析
        String dateStr = "2024年03月18日 12:12:12";
        System.out.println(LocalDateTime.parse(dateStr, formatter)); // 2024-03-18T12:12:12


    }
}
