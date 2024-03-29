package com.zgw.d1_collection;

import java.util.HashSet;

public class CollectionTest1 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>(); // 无序 不重复 无索引
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("1");
        System.out.println(set);
    }
}
