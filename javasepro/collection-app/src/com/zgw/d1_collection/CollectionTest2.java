package com.zgw.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import java.util.Objects;

public class CollectionTest2 {
    public static void main(String[] args) {
        // 多态写法，Collection是单列集合的祖宗
        Collection<String> c = new ArrayList<>();

        // public boolean add(E e):添加元素，添加成功返回true
        c.add("java1");
        c.add("java2");
        c.add("java3");
        System.out.println(c);

        // public void clear():情况集合元素
//        c.clear();
        System.out.println(c);

        // public boolean isEmpty():判断集合是否为空,是空则返回true
        System.out.println(c.isEmpty());

        // public int size():获取集合大小
        System.out.println(c.size());

        // public boolean contains(Object obj):判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));

        // public boolean remove(E e):删除某个元素：如果有多个重复元素默认删除第一个
        c.remove("java1");
        System.out.println(c);

        // public Object[] toArray():集合转成数组
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr2 = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------------");
        // 把一个集合的数据全部导入到另一个集合中去
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2); // c2集合中全部数据导入c1集合中
        System.out.println(c1);
    }
}
