package com.effectivejava.study.chapter01.item06;

public class AutoBoxing {

    public static long sum() {
        long sum = 0L;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }
}
