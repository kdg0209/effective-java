package com.effectivejava.study.chapter03.Item21;

public interface Phone {

    void call(String number);

    default void videoCall(String number) {
        System.out.println(number + "로 화상전화를 겁니다.");
    }
}
