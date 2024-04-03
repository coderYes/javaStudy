package com.zgw.d5_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "张三", "王小二");
        List<String> list = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张") && name.length() == 3) {
                list.add(name);
            }
        }
        System.out.println(list);

        // stream流解决
//        List<String> list2 = names.stream().filter(s -> s.startsWith("张") && s.length() == 3).collect(Collectors.toList());
        List<String> list2 = names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());
        System.out.println(list2);
    }
}
