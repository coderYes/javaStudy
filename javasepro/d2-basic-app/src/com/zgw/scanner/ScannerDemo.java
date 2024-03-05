package com.zgw.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = scanner.nextInt();
        System.out.println("你的年龄是:" + age);
        System.out.println("请输入你的姓名");
        String name = scanner.next();
        System.out.println("你的姓名:" + name);
    }
}
