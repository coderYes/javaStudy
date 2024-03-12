package com.zgw.d1_polymorphism;

public class Student extends People {
    public String name = "子类Student的name";

    @Override
    public void run() {
        System.out.println("running");
    }
}
