package com.zgw.d2_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        // lambda
        list.forEach(s -> System.out.println(s));
    }
}
