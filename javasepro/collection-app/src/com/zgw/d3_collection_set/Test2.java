package com.zgw.d3_collection_set;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("aaa", 18, 169.5);
        Student s2 = new Student("bbb", 28, 175.5);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String str1 = new String("abc");
        String str2 = new String("acD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
