package com.zgw.d4_jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdTest {
    public static void main(String[] args) {
        ZoneId zi = ZoneId.systemDefault();

        // 获取系统时区id
        System.out.println(zi.getId()); // Asia/Shanghai
        System.out.println(zi); // Asia/Shanghai

        // 获取所有时区id
        System.out.println(zi.getAvailableZoneIds());

        // 把某个时区id封装发ZoneId对象
        ZoneId ziOf = ZoneId.of("America/New_York");
        System.out.println(ziOf);

        // 获取某个时区的ZoneDateTime对象
        System.out.println(ZonedDateTime.now(ziOf));
        // 拿到世界标准时间
        System.out.println(ZonedDateTime.now(Clock.systemUTC()));

        // 获取系统默认时区的ZonedDateTime对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
