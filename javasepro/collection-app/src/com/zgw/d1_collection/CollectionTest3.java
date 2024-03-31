package com.zgw.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTest3 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");
        System.out.println(c);

        // 使用迭代器遍历集合
        // 1.从集合对象中获取迭代器对象
        Iterator<String> i = c.iterator();
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());

        // 2.循环结合迭代器遍历集合
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

        // 3.增强for遍历集合或数组
        for (String ele : c) {
            System.out.println(ele);
        }

        String[] names = {"a1", "a2", "a3"};
        for (String name : names) {
            System.out.println(name);
        }

        // lambda表达式遍历集合
        c.forEach(s -> System.out.println(s));
        c.forEach(System.out::println);
     }
}
