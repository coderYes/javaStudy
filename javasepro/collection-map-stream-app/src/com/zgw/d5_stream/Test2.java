package com.zgw.d5_stream;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        // 获取list集合的stream流
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "张三", "王小二");
        Stream<String> stream = names.stream();

        // 获取set集合的stream流
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "张三丰", "张无忌", "张三", "王小二");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("三")).forEach(s -> System.out.println(s));

        // 获取map集合的stream流
        Map<String, Double> map = new HashMap<>();
        map.put("aaa", 168.5);
        map.put("bbb", 170.0);
        map.put("ccc", 155.5);
        map.put("ddd", 192.5);
        Set<String> keys = map.keySet();
        Stream<String> ks = keys.stream();
        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(e -> e.getKey().contains("a")).forEach(s -> System.out.println(s.getKey() + "----" + s.getValue()));

        // 获取数组的Stream流
        String[] names2 = {"张三丰", "张无忌", "张三", "王小二"};
        Stream<String> stream2 = Arrays.stream(names2);

    }
}
