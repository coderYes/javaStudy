package com.zgw.d2_final;

public class Test {
    public static void main(String[] args) {
        // 3.final可以修饰变量（局部变量，成员变量），且只能赋一次值
        final int a;
        a = 12;
        // a = 13; // 第二次赋值，报错
        final double r = 3.14;
        // r = 3.15; // 报错
    }

    public static void buy(final double z) {
        // z = 0.1; // 报错，防止内部修改
    }
}

// 1.final修饰的类不能被继承
final class A {
}
// class B extends A { }

// 2.final修饰方法，方法不能被重写
class C {
    public final void test() {

    }
}

class B extends C {
//    @Override
//    public void test() {
//    }
}