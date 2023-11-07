package com.link.threaddemo.learn;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 直接提交队列
 *
 * @author Link
 * @date 2023/11/06 23:37
 **/
public class PoolTest4 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor =
                null;
        try {
            // 创建线程池对象
            threadPoolExecutor = new ThreadPoolExecutor(2, 3, 1, TimeUnit.MINUTES, new SynchronousQueue<>());
            // 创建任务
            Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
            // 将任务提交给线程池
            for (int i = 0; i < 4; i++) {
                threadPoolExecutor.execute(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //关闭线程池
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
                if (!threadPoolExecutor.awaitTermination(1, TimeUnit.MINUTES)) {
                    //等待1分钟，如果线程池还没有关闭则强行关闭
                    threadPoolExecutor.shutdownNow();
                }
            }
        }


    }
}
