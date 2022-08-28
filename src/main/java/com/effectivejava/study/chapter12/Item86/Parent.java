package com.effectivejava.study.chapter12.Item86;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Parent implements Serializable {

    private final String defaultVersion = "1.0.0";
}
