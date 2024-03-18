package com.zgw.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        // Duration用于计算两个事件对象相差的天数、小时数、分数、秒数、纳秒数,支持LocalTime、LocalDateTime、Instant等时间
        // 1.创建Duration对象，封装两个日期对象
        LocalDateTime start = LocalDateTime.of(2024, 3, 18, 19, 1, 1);
        LocalDateTime end = LocalDateTime.of(2024, 3, 18, 20, 0, 0);
        Duration duration = Duration.between(start,end);

        // 2.获取两个时间对象间隔的信息
        System.out.println(duration.toDays()); // 间隔多少天
        System.out.println(duration.toHours()); // 间隔多少小时
        System.out.println(duration.toMinutes()); // 间隔多少分
        System.out.println(duration.toSeconds()); // 间隔多少秒
        System.out.println(duration.toMinutes()); // 间隔多少毫秒
        System.out.println(duration.toNanos()); // 间隔多少纳秒

    }
}
