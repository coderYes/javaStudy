package com.zgw.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建arraylist集合对象
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add(111);
        list.add(99.9);
        System.out.println(list);

        // 对集合对象进行约束
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        // 往集合中的某个索引位置添加数据
        list2.add(1, "ccc");
        System.out.println(list2);
        // 获取集合某个索引位置的值
        System.out.println(list2.get(1));
        // 获取集合大小
        System.out.println(list2.size());
        // 删除集合某个索引位置的值
        list2.remove(2);
        System.out.println(list2);
        // 直接删除集合的某个值,多个同样的值则删除第一个值
        list2.remove("aaa");
        System.out.println(list2);
        // 修改集合某个索引位置的值，修改后返回原来的值
        System.out.println(list2.set(0, "cccc"));
        System.out.println(list2);
    }
}
