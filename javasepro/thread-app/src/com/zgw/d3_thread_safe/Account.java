package com.zgw.d3_thread_safe;

public class Account {
    private double money; // 余额
    private String cardId; // 卡号

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
        // 1.判断余额是否足够
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "取钱" + money + "成功");
                this.money -= money;
                System.out.println("余额剩余：" + this.money);
            } else {
                System.out.println(name + "余额不足");
            }
        }
    }
}
