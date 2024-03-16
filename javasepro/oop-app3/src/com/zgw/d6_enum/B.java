package com.zgw.d6_enum;

public enum B {
    X() {
        @Override
        public void go() {

        }
    }, Y("张三") {
        @Override
        public void go() {
            System.out.println(getName());
        }
    };

    private String name;

    B() {
    }

    B(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void go();
}
