package com.zgw.d1_create_thread;

public class Test1 {
    // main方法就是一条默认的主线程负责执行
    public static void main(String[] args) {
        // 创建MyThread线程类的对象代表一个线程
        Thread t = new MyThread();
        // 启动线程
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程Main线程输出" + i);
        }
    }
}
