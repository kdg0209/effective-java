package com.effectivejava.study.chapter07.Item43;

import lombok.ToString;

@ToString
public class Food {

    private final String name;

    public Food(String name) {
        this.name = name;
    }
}
