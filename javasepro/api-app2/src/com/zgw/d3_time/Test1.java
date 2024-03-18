package com.zgw.d3_time;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        // Data类的使用
        // 1.创建一个Date对象，代表系统当前时间信息
        Date d = new Date();
        System.out.println(d);

        // 2.拿到时间毫秒值
        long time = d.getTime();
        System.out.println(time);

        // 3.转换成日期对象
        time += 2 * 1000;
        Date d2 = new Date(time);
        System.out.println(d2);

    }
}
