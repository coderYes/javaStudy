package com.zgw.d6_lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        // 认识Lambda表达式
        Animal a = new Animal() {

            @Override
            public void run() {
                System.out.println("run-----------------");
            }
        };
        a.run();

        // Lambda简化后，只能简化函数式接口的匿名内部类
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("swim-----------");
            }
        };
        s.swim();

        Swimming s2 = () -> {
            System.out.println("swim2--------------");
        };
        s2.swim();
    }
}

interface Swimming {
    void swim();
}

abstract class Animal {
    public abstract void run();
}
