package com.zgw.d5_abstract_template;

public abstract class People {

    /**
     * 设计模板方法设计模式
     */
    public void write(){
        System.out.println("\t\t\t\t\t《作文题目a》");
        System.out.println("\t\t作文第一段");
        System.out.println(writeMain());
        System.out.println("\t\t作文最后一段");
    }

    public abstract String writeMain();
}
