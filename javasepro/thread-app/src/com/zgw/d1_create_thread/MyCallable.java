package com.zgw.d1_create_thread;

import java.util.concurrent.Callable;

/**
 * 1.让这个类实现Callable接口
 */
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "" + sum;
    }
}
