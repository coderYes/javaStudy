package com.zgw.d3_inner_class;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.cry();

        // 把这个匿名内部类编译成一个子类，然后创建一个子类对象
        Animal a1 = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a1.cry();
    }
}

class Cat extends Animal {

    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }
}

abstract class Animal {
    public abstract void cry();
}