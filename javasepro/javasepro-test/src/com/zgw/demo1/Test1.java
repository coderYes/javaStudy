package com.zgw.demo1;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws Exception {
        // 1.定义一个List集合存储全部订单对象
        List<Order> orders = new ArrayList<>();

        // 2.导入dom4j
        SAXReader saxReader = new SAXReader();

        // 3.读取xml文件成为一个Document对象
        Document document = saxReader.read(Test1.class.getResourceAsStream("/orders.xml"));

        // 4.开始提取根元素
        Element root = document.getRootElement();

        // 5.提取一级子元素
        List<Element> ordersEles = root.elements();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 6.遍历每个订单元素
        for (Element ordersEle : ordersEles) {
            Order order = new Order();
            order.setId(Integer.valueOf(ordersEle.attributeValue("id")));
            order.setName(ordersEle.attributeValue("name"));
            order.setTime(LocalDateTime.parse(ordersEle.elementText("time"), dtf));
            order.setPrice(Double.valueOf(ordersEle.elementText("double")));
            orders.add(order);
        }
        System.out.println(orders);

        System.out.println("------------------------------------------------------------------------------------------------");
        // 7.使用Stream流找出今天之前的订单，并遍历输出
        orders.stream().filter(o -> o.getTime().isBefore(LocalDateTime.now())).forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------------------------------");
        // 8.使用Stream流找出集合中最贵的订单，把这个订单详细信息打印出来
        Order order = orders.stream().max((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())).get();
        System.out.println(order);

        System.out.println("------------------------------------------------------------------------------------------------");
        // 8.使用Stream流遍历集合中的每个订单，按价格降序
        orders.stream().sorted((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice())).forEach(System.out::println);

    }
}
