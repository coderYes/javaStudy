package com.zgw.d2_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        // 掌握BigDecimal的使用，解决小数运算失真的问题
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b); // 0.30000000000000004

        // 1.把小数变成字符串封装成BigDecimal对象来运算
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);
        System.out.println(c1); // 0.3

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
//        BigDecimal k = i.divide(j); // 报错，没有可精确表示的十进制结果
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP); // 设置精确位，舍入模式
        System.out.println(k);

        double rs = k.doubleValue();
        System.out.println(rs);
    }
}
