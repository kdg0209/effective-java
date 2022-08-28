package com.effectivejava.study.chapter11.Item78;

import java.util.concurrent.TimeUnit;

public class Example {

    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
           int i = 0;
           while (stopRequested) {
               i++;
           }
        });

        thread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
