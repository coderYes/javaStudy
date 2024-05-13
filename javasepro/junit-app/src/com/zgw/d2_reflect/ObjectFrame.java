package com.zgw.d2_reflect;


import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("junit-app\\src\\data.txt", true));

        Class c = obj.getClass();
        String cName = c.getSimpleName();
        ps.println("----------------" + cName + "----------------");
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            String value = field.get(obj) + "";
            ps.println(name + "=" + value);
        }
        ps.close();
    }
}
