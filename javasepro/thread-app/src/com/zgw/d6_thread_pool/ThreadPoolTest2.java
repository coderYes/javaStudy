package com.zgw.d6_thread_pool;

import com.zgw.d1_create_thread.MyCallable;

import java.util.concurrent.*;

public class ThreadPoolTest2 {
    public static void main(String[] args) throws Exception {
        // 通过ThreadPoolExecutor创建一个线程池对象
//        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        // 通过Executors创建一个线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(13);
        // 计算密集型任务：线程核心数量：cpu的核数 + 1
        // IO密集型任务：线程核心数量：cpu的核数 * 1


        // 使用线程处理Callable任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

    }
}
