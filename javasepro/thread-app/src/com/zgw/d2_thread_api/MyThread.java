package com.zgw.d2_thread_api;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            System.out.println(t.getName() + "输出：" + i);
        }
    }
}
