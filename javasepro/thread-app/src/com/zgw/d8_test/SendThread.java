package com.zgw.d8_test;

import java.util.List;
import java.util.Random;

public class SendThread extends Thread {
    private List<String> gift;
    private int count;

    public SendThread(List<String> gift, String name) {
        super(name);
        this.gift = gift;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Random r = new Random();
        while (true) {
            synchronized (gift) {
                if (gift.size() < 10) {
                    break;
                }
                String rs = gift.remove(r.nextInt(gift.size()));
                System.out.println(name + "发出了：" + rs);
                count++;
            }
        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
