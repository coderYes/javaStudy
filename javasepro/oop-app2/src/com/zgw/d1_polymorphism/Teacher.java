package com.zgw.d1_polymorphism;

public class Teacher extends People {
    public String name = "子类Teacher的name";

    @Override
    public void run() {
        System.out.println("runnnnnnn");
    }

    public void teach() {
        System.out.println("teach");
    }
}
