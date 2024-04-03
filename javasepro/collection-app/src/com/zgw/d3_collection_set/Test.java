package com.zgw.d3_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // 1.创建一个set集合对象
//        Set<Integer> set = new HashSet<>(); // 无序不重复 无索引
//        Set<Integer> set = new LinkedHashSet<>(); // 有序不重复 无索引
        Set<Integer> set = new TreeSet<>(); // 可排序不重复 无索引

        set.add(666);
        set.add(555);
        set.add(555);
        set.add(888);
        set.add(888);
        set.add(777);
        set.add(777);
        System.out.println(set);
    }
}
