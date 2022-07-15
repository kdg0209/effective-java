package com.effectivejava.study.chapter03.Item20;

public class CalculatorImpl implements Calculator {

    @Override
    public void add(int x, int y) {
        System.out.println("CalculatorImpl Call Override default Method : " + (x + y));
    }
}
