package com.zgw.d6_enum;

public class Test {
    public static void main(String[] args) {
        // 认识枚举

        A a1 = A.X;
        System.out.println(a1);

        A[] as = A.values();
        A a3 = A.valueOf("Z");
        System.out.println(as);
        System.out.println(a3.name());
        System.out.println(a3.ordinal()); // 拿到索引

    }
}
