package com.zgw.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test2Constructor {
    @Test
    public void testGetConstructors() {
        // 1.反射第一步，必须先得到类的class对象
        Class c = Cat.class;
        // 2.获取类的全部构造器
//        Constructor[] constructors = c.getConstructors();  // 获取public修饰的构造器
        Constructor[] constructors = c.getDeclaredConstructors(); // 获取全部构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "--->" + constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws Exception {
        Class c = Cat.class;
//        Constructor constructors = c.getConstructor(); // 获取某个public修饰的构造器
        Constructor constructors = c.getDeclaredConstructor(); // 获取某个构造器
        System.out.println(constructors.getName() + "--->" + constructors.getParameterCount());

        // 获取有参数构造器
        Constructor constructors2 = c.getConstructor(String.class, int.class);
        System.out.println(constructors2.getName() + "--->" + constructors2.getParameterCount());

    }
}
