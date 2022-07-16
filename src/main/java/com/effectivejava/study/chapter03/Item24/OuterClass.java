package com.effectivejava.study.chapter03.Item24;

public class OuterClass {

    private String name;

    // 정적 멤버 클래스
    public static class StaticInnerClass {

        private int age;
    }

    // 비정적 멤버 클래스
    public class InnerClass {

        private int age;
    }
}
