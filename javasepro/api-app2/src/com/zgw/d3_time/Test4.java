package com.zgw.d3_time;

import java.util.Calendar;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) {
        // 掌握Calendar的使用和特点
        // 1.得到系统此刻时间对应的日历对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 2.获取日历中的某个信息
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.MONTH) + 1);
        System.out.println(now.get(Calendar.DAY_OF_YEAR));

        // 3.拿到日历中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);

        // 4.拿到时间毫秒值
        System.out.println(now.getTimeInMillis());

        // 5.修改日历中的某个信息
        now.set(Calendar.MONTH,9);
        System.out.println(now.get(Calendar.MONTH));

        // 6.为某个信息增加或者减少多少
        now.add(Calendar.DAY_OF_YEAR,1);
        System.out.println(now.get(Calendar.DAY_OF_YEAR));
    }
}
