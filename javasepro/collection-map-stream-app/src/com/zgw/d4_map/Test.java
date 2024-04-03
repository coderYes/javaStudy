package com.zgw.d4_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>(); // 无序 不重复 无索引
        Map<String, Integer> map = new LinkedHashMap<>(); // 有序 不重复 无索引
        map.put("aaa", 100);
        map.put("bbb", 200);
        map.put(null, null);
        map.put("ccc", 1);
        System.out.println(map);

        Map<Integer, String> map1 = new TreeMap<>(); // 可排序 不重复 无索引
        map1.put(23, "aaa");
        map1.put(23, "bbb");
        map1.put(19, "ccc");
        map1.put(18, "ddd");
        System.out.println(map1);

        // 获取集合大小
        System.out.println(map1.size());

        // 清空集合
//        map.clear();

        // 判断集合是否为空
        System.out.println(map1.isEmpty());

        // 根据键获取值
        System.out.println(map1.get(23));

        // 根据键删除整个元素
        map1.remove(23);
        System.out.println(map1);

        // 判断是否包含某个键
        System.out.println(map1.containsKey(18));

        // 判断是否包含某个值
        System.out.println(map1.containsValue("ddd"));

        // 获取map集合全部键
        System.out.println(map1.keySet());

        // 获取map集合全部值
        System.out.println(map1.values());

        // 把其他map集合数据导入到自己的集合中
        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "eee");
        map2.put(2, "fff");
        map1.putAll(map2);
        System.out.println(map1);
    }
}
