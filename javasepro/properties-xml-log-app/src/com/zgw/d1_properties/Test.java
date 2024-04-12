package com.zgw.d1_properties;

import java.io.FileReader;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1.创建一个Properties对象
        Properties properties = new Properties();

        // 2.加载属性文件中的键值对到properties对象中去
        properties.load(new FileReader("properties-xml-log-app/src/users.properties"));

        System.out.println(properties);
    }
}
