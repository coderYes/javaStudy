package com.zgw.d2_xml;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Test2 {
    public static void main(String[] args) {
        // 1.使用一个StringBuilder对象来拼接XML格式的数据
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\r\n");
        sb.append("<book>\r\n");
        sb.append("\t<name>").append("假如给我三件光明装备").append("</name>\r\n");
        sb.append("\t<author>").append("佚名").append("</author>\r\n");
        sb.append("\t<price>").append(999).append("</price>\r\n");
        sb.append("</book>");

        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("properties-xml-log-app/src/helloworld2.xml"));
        ) {
            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
