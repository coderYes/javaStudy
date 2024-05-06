package com.zgw.d7_tz;

public class MyRunnable implements Runnable {

    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (this) {
                this.count++;
                System.out.println("count:" + this.count);
            }
        }

    }
}
