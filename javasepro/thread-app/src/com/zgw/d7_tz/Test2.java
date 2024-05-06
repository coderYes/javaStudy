package com.zgw.d7_tz;

public class Test2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable2();
        for (int i = 1; i <= 100; i++) {
            new Thread(target).start();
        }
    }
}
