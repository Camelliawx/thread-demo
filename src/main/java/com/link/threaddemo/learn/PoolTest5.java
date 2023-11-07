package com.link.threaddemo.learn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * jdk便捷创建线程池方法：阿里巴巴手册不建议使用这个方法
 *
 * @author Link
 * @date 2023/11/07 00:35
 **/
public class PoolTest5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
    }
}
