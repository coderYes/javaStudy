package com.zgw.d2_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1.创建dom4j框架提供的解析器对象
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("properties-xml-log-app/src/helloworld.xml");

        // 2.从文档对象中解析XML文件的全部数据
        Element root = document.getRootElement();
        System.out.println(root.getName());

        // 3.获取根元素下的全部一级子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        // 4.获取当前元素下的某个子元素
        Element people = root.element("people");
        System.out.println(people.getText());

        // 5.如果下面很多子元素user，默认获取第一个
        Element user = root.element("user");
        System.out.println(user.elementText("name"));

        // 6.获取元素的属性信息
        System.out.println(user.attributeValue("id"));
        Attribute id = user.attribute("id");
        System.out.println(id.getName());
        System.out.println(id.getValue());

        List<Attribute> attributes = user.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName() + "---" + attribute.getValue());
        }

        // 7.获取全部文本内容
        System.out.println(user.elementText("name"));
    }
}
