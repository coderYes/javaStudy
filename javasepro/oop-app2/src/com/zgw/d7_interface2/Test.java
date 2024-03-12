package com.zgw.d7_interface2;

public class Test {
    public static void main(String[] args) {
        Student s = new A();
        Driver d = new A();
        Singer singer = new A();
        
        d.drive();
        singer.sing();

    }

}

class A extends Student implements Driver, Singer {

    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void sing() {
        System.out.println("sing");
    }
}

class Student {

}

interface Driver {
    void drive();
}

interface Singer {
    void sing();
}
