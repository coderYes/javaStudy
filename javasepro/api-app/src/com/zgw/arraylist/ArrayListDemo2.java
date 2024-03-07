package com.zgw.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java入门");
        list.add("web前端");
        list.add("大前端时代");
        list.add("linux设计");
        list.add("docker入门");
        list.add("nodejs入门");
        System.out.println(list);

        // 找出包含'前端'的数据,方法二倒着遍历
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if (ele.contains("前端")) {
                list.remove(ele);
                i--;
            }
        }
        System.out.println(list);
    }
}
