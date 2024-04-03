package com.zgw.d4_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("小帅", 1.85);
        map.put("小美", 1.65);
        map.put("小a", 1.55);

        // 获取map集合全部键
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // 遍历全部键，根据键获取值
        for (String key : keys) {
            System.out.println(map.get(key));
        }

        // 调用map集合提供的entrySet方法，把map集合转换成键值对类型的Set集合
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {

            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }

        // lambda
        map.forEach((k, v) -> System.out.println(k + "---->" + v));

    }
}
