package com.zgw.d2_collection_list;

import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        // 1.创建一个队列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("aaa");
        queue.addLast("bbb");
        queue.addLast("ccc");
        queue.addLast("ddd");
        System.out.println(queue);

        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("-------------------------");

        // 2.创建一个栈对象
        LinkedList<String> stack = new LinkedList<>();

        // 压栈(push)
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);

        // 出栈(pop)
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }}
