package com.zgw.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class Test3Field {
    @Test
    public void testGetFields() throws Exception {
        // 反射第一步：得到类的class对象
        Class c = Cat.class;

        // 获取类的全部成员变量
        Field[] fields = c.getDeclaredFields();

        // 变量成员变量数组
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }

        // 定位某个成员变量
        Field name = c.getDeclaredField("name");
        System.out.println(name.getName() + " " + name.getType());

        // 赋值某个成员变量
        Cat cat = new Cat();
        name.setAccessible(true);
        name.set(cat, "aaa");
        System.out.println(cat.getName());

        // 取值
        System.out.println(name.get(cat));
    }
}
