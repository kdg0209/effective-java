package com.effectivejava.study.chapter06.Item37;

import lombok.Getter;

@Getter
public class Plant {

    public enum LifeCycle {
        ANNUAL, PERENNIAL, BIENNIAL
    }

    private final String name;
    private final LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }
}
