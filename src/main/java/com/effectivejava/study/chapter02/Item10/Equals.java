package com.effectivejava.study.chapter02.Item10;

public class Equals {

    @Override
    public boolean equals(Object o) {
        throw new AssertionError(); // 호출 금지
    }
}
