package com.zgw.demo4;

import java.util.List;
import java.util.Random;

public class PeopleThread extends Thread {
    private List<Integer> moneys;

    private int totalMoney;
    private Random r = new Random();

    public PeopleThread(List<Integer> moneys, String name) {
        super(name);
        this.moneys = moneys;
    }

    @Override
    public void run() {
        // 100个线程抢红包
        while (true) {
            String name = Thread.currentThread().getName();
            synchronized (moneys) {
                if (moneys.size() == 0) {
                    break;
                }
                // 取红包
                int money = moneys.remove(r.nextInt(moneys.size()));
                System.out.println(name + "抢到" + money);
                totalMoney += money;
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
