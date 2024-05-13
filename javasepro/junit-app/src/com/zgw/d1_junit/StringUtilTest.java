package com.zgw.d1_junit;


import org.junit.*;

public class StringUtilTest {

    // 每个测试方法执行之前执行一次
    @Before
    public void test1(){
        System.out.println("----->test before");
    }

    // 所有测试方法之前只执行一次
    @BeforeClass
    public static void test11(){
        System.out.println("----->test11 BeforeClass");
    }

    // 每个测试方法执行之后执行一次
    @After
    public void test2(){
        System.out.println("----->test2 after");
    }

    // 所有测试方法之后只执行一次
    @AfterClass
    public static void test22(){
        System.out.println("----->test22 AfterClass");
    }

    @Test
    public void testPrintNumber() {
        StringUtil.printNumber("admin");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex() {
        int index1 = StringUtil.getMaxIndex(null);
        System.out.println(index1);

        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println(index2);

        // 断言机制：预测业务的结果
        Assert.assertEquals("error", 4, index2);
    }
}
