package com.effectivejava.study.chapter12.Item86;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Child extends Parent implements Serializable {

    private String version;

    public Child(String version) {
        super();
        this.version = version;
    }
}
