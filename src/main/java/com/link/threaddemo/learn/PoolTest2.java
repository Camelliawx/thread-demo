package com.link.threaddemo.learn;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Link
 * @date 2023/11/06 23:37
 **/
public class PoolTest2 {
    public static void main(String[] args) {
        // 创建线程池对象
        ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(2, 3, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2));
        // 创建任务
        Runnable runnable = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        };
        // 将任务提交给线程池
        for (int i = 0; i < 5; i++) {
            threadPoolExecutor.execute(runnable);
        }
        System.out.println(threadPoolExecutor);
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadPoolExecutor);

    }
}
