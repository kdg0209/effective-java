package com.effectivejava.study.chapter08.Item49;

import java.util.Objects;

public class Example {

    public static void main(String[] args) {
        String s = null;
        s = Objects.requireNonNull(s, "해당 문자열은 NULL입니다.");

        System.out.println(s);
    }
}
