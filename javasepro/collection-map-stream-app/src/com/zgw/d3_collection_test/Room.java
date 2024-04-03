package com.zgw.d3_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {
    private List<Card> allCard = new ArrayList<>();

    public Room() {
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        int size = 0;
        // 遍历点数、花色
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c = new Card(number, color, size);
                allCard.add(c);
            }
        }
        Card c1 = new Card("", "🃏", ++size);
        Card c2 = new Card("", "🃏", ++size);
        Collections.addAll(allCard, c1, c2);
        System.out.println("新牌：" + allCard);
    }

    // 游戏启动
    public void start() {
        // 1.洗牌
        Collections.shuffle(allCard);
        System.out.println("洗牌后：" + allCard);

        // 2.发牌
        List<Card> xiaomei = new ArrayList<>();
        List<Card> xiaoshuai = new ArrayList<>();
        List<Card> xiaowang = new ArrayList<>();
        for (int i = 0; i < allCard.size() - 3; i++) {
            Card c = allCard.get(i);
            if (i % 3 == 0) {
                xiaomei.add(c);
            } else if (i % 3 == 1) {
                xiaoshuai.add(c);
            } else if (i % 3 == 2) {
                xiaowang.add(c);
            }
        }
        System.out.println("xiaomei的牌：" + xiaomei);
        System.out.println("xiaoshuai的牌：" + xiaoshuai);
        System.out.println("xiaowang的牌：" + xiaowang);
        List<Card> lastThreeCards = allCard.subList(allCard.size() - 3, allCard.size());
        System.out.println("底牌：" + lastThreeCards);
        xiaomei.addAll(lastThreeCards);
        sortCards(xiaomei);
        System.out.println("地主xiaomei的牌：" + xiaomei);
    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, (Card o1, Card o2) -> o2.getSize() - o1.getSize());
    }
}
