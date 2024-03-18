package com.zgw.d3_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        // 掌握SimpleDateFormat的使用
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        // 格式化日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String format = simpleDateFormat.format(d);
        System.out.println(format);

        // simpleDateFormat解析字符串时间，成为日期对象
        String dateStr = "2022-12-12 12:12:12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf.parse(dateStr);
        System.out.println(d2);
    }
}
