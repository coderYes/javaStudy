package com.zgw.d3_inner_class;

public class Test2 {
    public static void main(String[] args) {
        go(new Swimming() {

            @Override
            public void swim() {
                System.out.println("这是一只狗");
            }
        });
    }

    public static void go(Swimming s) {
        System.out.println("开始------------------");
        s.swim();
    }
}


interface Swimming {
    void swim();
}