package com.zgw.d1_inner_class;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.setName("aaaa");
        inner.test();
    }
}
