package com.zgw.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodlist = new ArrayList<>();

    public void addFood() {
        Food food = new Food();

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入菜品名称:");
        String name = sc.next();
        food.setName(name);

        System.out.println("请输入菜品价格:");
        double price = sc.nextDouble();
        food.setPrice(price);

        System.out.println("请输入菜品描述:");
        String desc = sc.next();
        food.setDesc(desc);
        foodlist.add(food);
    }

    public void showAllFoods() {
        if (foodlist.size() == 0) {
            System.out.println("没有菜品请先输入");
            return;
        }
        for (int i = 0; i < foodlist.size(); i++) {
            Food f = foodlist.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("----------------------");
        }
    }

    public void start() {
        while (true) {
            System.out.println("请选择功能:");
            System.out.println("1.上架菜品");
            System.out.println("2.展示菜品");
            System.out.println("3.退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择你的操作:");
            String command = sc.next();
            switch (command) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("下次再来");
                    return;
                default:
                    System.out.println("输入命令不存在");
            }
        }
    }
}
