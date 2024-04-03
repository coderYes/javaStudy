package com.zgw.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 为集合批量添加数据
        Collections.addAll(list, "aaa", "bbb", "ccc");
        System.out.println(list);

        // 打乱集合中的元素顺序
        Collections.shuffle(list);
        System.out.println(list);

        // 对集合中的元素进行升序排序
        Collections.sort(list);
        System.out.println(list);

        // 对集合
    }
}
