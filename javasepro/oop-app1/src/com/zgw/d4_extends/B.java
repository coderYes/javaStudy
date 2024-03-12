package com.zgw.d4_extends;

// 子类
public class B extends A {
    // 子类可以继承父类的非私有成员

    public void print3() {
        System.out.println(i);
        print1();
    }
}
