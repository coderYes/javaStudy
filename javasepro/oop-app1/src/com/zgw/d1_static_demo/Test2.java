package com.zgw.d1_static_demo;

public class Test2 {
    public static void main(String[] args) {
        // 应用场景：要求用户类记住自己创建了多少个用户对象
        new User();
        new User();
        new User();
        new User();
        System.out.println(User.number);
    }
}
