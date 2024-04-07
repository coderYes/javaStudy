package com.zgw.demo1;

public class People {
    private int code;
    private int location;

    public People() {
    }

    public People(int code, int location) {
        this.code = code;
        this.location = location;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "People{" +
                "code=" + code +
                ",location=" + location +
                "}";
    }
}
