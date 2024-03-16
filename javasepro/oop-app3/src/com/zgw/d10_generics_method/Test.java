package com.zgw.d10_generics_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String rs = test("java");
        System.out.println(rs);

        test(new Cat());

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new BENZ());
        go(cars);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(bmws);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        // go(cats); // 报错，cat不在car类型里

    }

    // ? 代表一切类型
    public static void go(ArrayList<? extends Car> cars) {

    }

//    public static <T extends Car> void go(ArrayList<T> cars) {
//
//    }

    public static <T> T test(T t) {
        return t;
    }
}
