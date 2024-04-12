package com.zgw.d1_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个Properties对象
        Properties properties = new Properties();
        properties.setProperty("aaa", "aaaa");
        properties.setProperty("bbb", "bbbb");

        properties.store(new FileWriter("properties-xml-log-app/src/users2.properties"),"i saved many users!");
        System.out.println(properties);
        if(properties.containsKey("aaa")){
            properties.setProperty("aaa","aaaaa");
        }
        System.out.println(properties);

    }
}
