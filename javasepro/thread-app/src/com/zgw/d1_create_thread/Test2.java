package com.zgw.d1_create_thread;

public class Test2 {
    public static void main(String[] args) {
        // 创建任务对象
        Runnable target = new MyRunnable();
        // 任务对象没有start方法，把任务对象交给一个线程对象处理
        new Thread(target).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程Main线程输出" + i);
        }
    }
}
