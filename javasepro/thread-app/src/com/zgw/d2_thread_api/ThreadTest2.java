package com.zgw.d2_thread_api;

public class ThreadTest2 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            if(i==3){
                // 当前执行线程暂停5秒，再继续执行
                Thread.sleep(5000);
            }
        }

        Thread t1 = new MyThread("线程1");
        t1.start();
        t1.join();
        Thread t2 = new MyThread("线程2");
        t2.start();
        t2.join();
        Thread t3 = new MyThread("线程3");
        t3.start();
        t3.join();
    }
}
