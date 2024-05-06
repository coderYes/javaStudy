package com.zgw.d4_synchronized_method;

public class DrawThread extends Thread {
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 取钱
        acc.drawMoney(100000);
    }
}