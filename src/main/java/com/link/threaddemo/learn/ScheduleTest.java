package com.link.threaddemo.learn;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author camellia
 * @date 2023/11/6 - 18:04
 */
public class ScheduleTest {

    public static void main(String[] args) {
        //获取对象:创建一个核心线程
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(()
                ->{ System.out.println(System.currentTimeMillis());
    },2,3,TimeUnit.SECONDS);


}

    public static void schedule() {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(()
                -> System.out.println(Thread.currentThread().getName()), 1, TimeUnit.SECONDS);
        scheduledExecutorService.shutdownNow();
    }
}
