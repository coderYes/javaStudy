package com.zgw.d9_interface_jdk8;

public interface A {
    /**
     * 1.默认方法：必须使用default修饰，默认会被public修饰
     */
    public default void test1() {
        System.out.println("===默认方法===");
        test2();
    }

    /**
     * 2.私有方法：必须使用private修饰
     */
    private void test2() {
        System.out.println("===私有方法===");
    }

    /**
     * 3.静态方法，必须使用static修饰
     */
    static void test3() {
        System.out.println("===静态方法===");
    }
}
