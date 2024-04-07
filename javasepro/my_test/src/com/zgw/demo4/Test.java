package com.zgw.demo4;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张三");
        list.add("王小二");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
