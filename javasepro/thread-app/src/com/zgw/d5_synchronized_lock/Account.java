package com.zgw.d5_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double money; // 余额
    private String cardId; // 卡号
    // 创建一个锁对象
    private final Lock lk = new ReentrantLock();

    public Account() {
    }

    public Account(double money, String cardId) {
        this.money = money;
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        try {
            lk.lock(); // 加锁
            // 1.判断余额是否足够
            if (this.money >= money) {
                System.out.println(name + "取钱" + money + "成功");
                this.money -= money;
                System.out.println("余额剩余：" + this.money);
            } else {
                System.out.println(name + "余额不足");
            }
            lk.unlock(); // 解锁
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();
        }
    }
}
