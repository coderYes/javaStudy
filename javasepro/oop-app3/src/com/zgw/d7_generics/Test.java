package com.zgw.d7_generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("aaa");
        // list1.add(123); // 约束传入的类型，无法添加String类型以外的数据
    }
}
