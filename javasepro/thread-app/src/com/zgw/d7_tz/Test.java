package com.zgw.d7_tz;

public class Test {
    public static void main(String[] args) {
        // 悲观锁：一上来就加锁，每次只能一个线程进入访问完毕后，再解锁
        // 乐观锁：一开始不上锁，大家一起跑，等要出现线程安全问题的时候才开始控制，线程安全，性能较好

        // 需求：1个静态变量，100个线程，每个线程对齐加100次
        Runnable target = new MyRunnable();
        for (int i = 1; i <= 100; i++) {
            new Thread(target).start();
        }
    }
}
