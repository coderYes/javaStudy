package com.zgw.d2_collection_list;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象(有序、可重复、有索引)
        List<String> list = new ArrayList<>();

        // 2.add
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(2,"ddd");
        System.out.println(list);

        // 3.remove
        System.out.println(list.remove(2));
        System.out.println(list);

        // 4.get
        System.out.println(list.get(2));

        // 5.set
        System.out.println(list.set(2, "ddd"));
        System.out.println(list);
    }
}
