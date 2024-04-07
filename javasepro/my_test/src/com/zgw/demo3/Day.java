package com.zgw.demo3;

import java.time.LocalDate;

public class Day {
    private LocalDate date;
    private boolean flag;

    public Day() {
    }

    public Day(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void printInfo() {
        System.out.println(date + (flag ? "[休息]" : ""));
    }
}
