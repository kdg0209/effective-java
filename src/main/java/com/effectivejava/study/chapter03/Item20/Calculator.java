package com.effectivejava.study.chapter03.Item20;

public interface Calculator {

    default void add(int x, int y) {
        System.out.println("Calculator Call default Method : " + (x + y));
    }

    static void minus(int x, int y) {
        System.out.println("Calculator Call static Method : " + (x - y));
    }
}
