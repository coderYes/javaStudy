package com.zgw.d6_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolTest1 {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        Runnable target = new MyRunnable();
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
//        pool.shutdown(); // 关闭线程池
//        pool.shutdownNow(); //立即关闭线程池
    }
}
