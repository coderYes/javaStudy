package com.zgw.d1_math;

public class Test {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(-2)); // 2
        System.out.println(Math.abs(-3.14)); // 3.14

        // 向上取整
        System.out.println(Math.ceil(4.00001)); // 5.0
        System.out.println(Math.ceil(4.0)); // 4.0

        // 向下取整
        System.out.println(Math.floor(4.99999)); // 4.0

        // 四舍五入
        System.out.println(Math.round(3.4999)); // 3
        System.out.println(Math.round(3.5999)); // 4

        // 取最大/最小值
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.min(10, 20)); // 10

        // 次方
        System.out.println(Math.pow(2, 3)); // 8.0

        // 取随机数0.0~1.0 不包含1.0
        System.out.println(Math.random());


    }
}
