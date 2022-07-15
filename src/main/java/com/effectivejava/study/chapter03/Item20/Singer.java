package com.effectivejava.study.chapter03.Item20;

public interface Singer {

    default void sing(String name) {
        System.out.println(name + "인 노래를 부릅니다.");
    }
}
