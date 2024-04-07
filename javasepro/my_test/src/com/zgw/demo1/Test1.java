package com.zgw.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test1 {
    public static List<People> list = new ArrayList<>();

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 100; i++) {
            while (true) {
                int code = r.nextInt(200) + 1;
                if (!isRepeat(code)) {
                    list.add(new People(code, i));
                    break;
                }
            }
        }

        // 反复删除奇数位置处的人
        while (list.size() > 1) {
            List<People> list2 = new ArrayList<>();
            for (int i = 1; i < list.size(); i+=2) {
                list2.add(list.get(i));

            }
            list = list2;
        }
        People luckPeople = list.get(0);
        System.out.println(luckPeople);
    }

    public static boolean isRepeat(int code) {
        for (People people : list) {
            if (people.getCode() == code) {
                return true;
            }

        }
        return false;
    }
}
