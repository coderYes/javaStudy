package com.zgw.d3_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String x1 = "2023年11月11日 0:01:18";
        String x2 = "2023年11月11日 0:10:57";

        // 字符串时间解析成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt = sdf.parse(start);
        Date endDt = sdf.parse(end);
        Date x1Dt = sdf.parse(x1);
        Date x2Dt = sdf.parse(x2);

        // 判断是否秒杀成功
        long startTime = startDt.getTime();
        long endTime = endDt.getTime();
        long x1Time = x1Dt.getTime();
        long x2Time = x2Dt.getTime();

        if (x1Time >= startTime && x1Time < endTime) {
            System.out.println("x1秒杀成功");
        } else {
            System.out.println("x1秒杀失败");
        }
        if (x2Time >= startTime && x2Time < endTime) {
            System.out.println("x2秒杀成功");
        } else {
            System.out.println("x2秒杀失败");
        }
    }
}
