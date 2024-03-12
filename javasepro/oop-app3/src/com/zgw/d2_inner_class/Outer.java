package com.zgw.d2_inner_class;

public class Outer {
    private int age;
    public static String schoolName;

    // 静态内部类
    public static class Inner {
        private String name;

        public void test() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
