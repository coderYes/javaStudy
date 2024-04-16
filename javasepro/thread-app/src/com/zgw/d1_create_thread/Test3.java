package com.zgw.d1_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> call = new MyCallable(5);
        FutureTask<String> ft =  new FutureTask<>(call);
        new Thread(ft).start();

        String rs = ft.get();
        System.out.println(rs);
    }
}
