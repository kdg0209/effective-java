package com.effectivejava.study.chapter12.Item89;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    private String[] text = {"a", "b"};

    private Object readResolve() {
        return INSTANCE;
    }

    public void print() {
        System.out.println(Arrays.toString(text));
    }
}
