package com.zgw.d4_synchronized_method;

public class ThreadTest {
    public static void main(String[] args) {
// 1.创建一个账户对象，代表两个人的共享账户
        Account acc = new Account(100000, "ICBC-110");
        // 2.创建两个线程
        new DrawThread(acc, "小明").start(); // 线程1
        new DrawThread(acc, "小红").start(); // 线程2


        Account acc1 = new Account(100000, "ICBC-111");
        new DrawThread(acc1, "小黑").start(); // 线程3
        new DrawThread(acc1, "小白").start(); // 线程4

    }
}
