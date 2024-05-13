package com.zgw.d3_annotation;

@MyTest4(value = "小帅", aaa = 99.5, bbb = {"AA", "BB", "CC"})
public class Demo {
    @MyTest4(value = "小美", aaa = 199.5, bbb = {"DD", "EE", "FF"})
    public void test1() {

    }
}
