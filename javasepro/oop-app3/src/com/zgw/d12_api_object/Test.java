package com.zgw.d12_api_object;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1 = "zgw";
        String s2 = "zgw";
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));

        String s3 = null;
        String s4 = "zgw";
        // System.out.println(s3.equals(s4)); // 空指针报错
        System.out.println(Objects.equals(s3, s4)); // false

        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s4));

        System.out.println(Objects.nonNull(s3));
        System.out.println(Objects.nonNull(s4));
    }
}
