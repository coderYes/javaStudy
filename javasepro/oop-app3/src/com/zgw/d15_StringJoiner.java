package com.zgw;

import java.util.StringJoiner;

public class d15_StringJoiner {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("java1");
        stringJoiner.add("java2");
        stringJoiner.add("java3");
        System.out.println(stringJoiner);

        StringJoiner s = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < 10; i++) {
            s.add(i + "");
        }
        System.out.println(s);
    }
}
