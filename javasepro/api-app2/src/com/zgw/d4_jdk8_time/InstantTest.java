package com.zgw.d4_jdk8_time;

import java.time.Instant;
import java.time.LocalTime;

public class InstantTest {
    public static void main(String[] args) {
        // 1.创建Instant对象，获取此刻时间信息
        Instant now = Instant.now();
        // 2.获取总秒数
        System.out.println(now.getEpochSecond()); // 1710757657
        // 3.不够一秒的纳秒数
        System.out.println(now.getNano()); // 144018300
        System.out.println(now); // 2024-03-18T10:28:28.950980500Z

        System.out.println(now.plusNanos(111));

        // Instant对象作用：做代码性能分析
        Instant now1 = Instant.now();
        Instant now2 = Instant.now();
        System.out.println(now2.getEpochSecond() - now1.getEpochSecond());
    }
}
