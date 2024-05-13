package com.zgw.d2_reflect;

public class Test5Frame {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("小帅", 18, '男', 1.88);

        // 把任意对象字段名和对应值保存到文件中
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(s1);

    }
}
