package com.zgw.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Method;

public class Test4Method {
    @Test
    public void testGetMethod() throws Exception {
        Class c = Cat.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "--->" + method.getParameterCount() + "--->" + method.getReturnType());
        }
        System.out.println("----------------------------");
        // 获取某个方法对象
        Method eat = c.getDeclaredMethod("eat");
        System.out.println(eat.getName() + "--->" + eat.getParameterCount() + "--->" + eat.getReturnType());
        Method eat2 = c.getDeclaredMethod("eat", String.class);
        System.out.println(eat2.getName() + "--->" + eat2.getParameterCount() + "--->" + eat2.getReturnType());

        Cat cat = new Cat();
        System.out.println(eat.invoke(cat));
        eat2.setAccessible(true);
        System.out.println(eat2.invoke(cat, "芝士汉堡"));

    }
}
