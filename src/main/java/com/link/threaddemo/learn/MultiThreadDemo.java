package com.link.threaddemo.learn;

/**
 * 多线程demo
 * @author Link
 * @date 2023/11/07 18:40
 **/
public class MultiThreadDemo {
    public static void main(String[] args) {
        // 创建两个线程对象
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));

        // 启动线程
        thread1.start();
        thread2.start();
    }

    /**
     * 自定义任务类
     * @author Link
     * @date 2023/11/07 18:41
     */
    static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Executing " + name + ", iteration " + i);
                try {
                    // 休眠一段时间
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}