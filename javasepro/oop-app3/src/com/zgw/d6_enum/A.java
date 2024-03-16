package com.zgw.d6_enum;

public enum A {
    // 枚举类第一行必须罗列枚举对象的名字
    X, Y, Z;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
