package com.zgw.d8_generics;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        // list.add(11); // 报错
        String ele = list.get(1);
        System.out.println(ele);

        MyClass2<String, String> myClass2 = new MyClass2<>();
    }
}
