package com.zgw.d3_annotation;

@MyTest2("小美")
@MyTest1(aaa = "小帅", bbb = false, ccc = {"A", "B", "C"})
public class AnnotationTest1 {
    @MyTest1(aaa = "小帅2", bbb = true, ccc = {"D", "E", "F"})
    public void test1() {

    }
}
