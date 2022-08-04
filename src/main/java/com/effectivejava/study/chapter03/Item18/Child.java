package com.effectivejava.study.chapter03.Item18;

public class Child extends Super {

    String name;

    public Child(String name) {
        System.out.println("Child Class");
        this.name = name;
    }
}
