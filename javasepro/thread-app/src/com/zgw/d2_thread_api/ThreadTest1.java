package com.zgw.d2_thread_api;

public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("线程1");
//        t1.setName("线程1");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("线程2");
//        t2.setName("线程2");
        t2.start();
        System.out.println(t2.getName());

        // 主线程对象名字
        // 那个线程执行它，他就会得到哪个线程对象
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 3; i++) {
            System.out.println("main线程输出：" + i);
        }
    }
}
