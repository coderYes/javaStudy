package com.zgw.d1_inner_class;

public class Outer {
    private int age = 99;

    // 成员内部类
    public class Inner {
        private String name;
        public static String schoolName; // JDK16开始支持定义静态成员
        private int age = 66;

        public void test() {
            // 成员方法可以直接访问外部成员
            System.out.println(age);

            int age = 33;
            System.out.println(age); // 33
            System.out.println(this.age); // 66
            System.out.println(Outer.this.age); // 66
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
