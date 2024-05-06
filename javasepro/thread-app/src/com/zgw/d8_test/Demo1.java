package com.zgw.d8_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        // 100份礼品，小a和小b同时发送，当礼品小于10份的时候不再送出，并统计小a和小b发送的数量
        List<String> gift = new ArrayList<>();
        String[] names = {"鲜花", "键盘", "显卡", "手表"};
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            gift.add(names[r.nextInt(names.length)] + (i + 1));
        }
        System.out.println(gift);

        SendThread xa = new SendThread(gift, "小a");
        xa.start();
        SendThread xb = new SendThread(gift, "小b");
        xb.start();

        xa.join();
        xb.join();

        System.out.println(xa.getCount());
        System.out.println(xb.getCount());
    }
}
