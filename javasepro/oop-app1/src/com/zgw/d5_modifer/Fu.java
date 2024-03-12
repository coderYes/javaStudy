package com.zgw.d5_modifer;

public class Fu {
    // 私有：只能在本类中访问
    private void privateMethod() {
        System.out.println("===privateMethod===");
    }

    // 缺省：本类，同一个包下的类访问
    void method() {
        System.out.println("===缺省===");
    }

    // protected：本类，同一个包下的类，任意包下的子类访问
    protected void protectedMethod() {
        System.out.println("===protectedMethod===");
    }

    // public：本类，同一个包下的类，任意包下的子类，任意包下的任意类访问
    public void publicMethod() {
        System.out.println("===publicMethod===");
    }

    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }

}
