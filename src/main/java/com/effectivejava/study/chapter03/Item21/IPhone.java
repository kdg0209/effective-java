package com.effectivejava.study.chapter03.Item21;

public class IPhone implements Phone {

    @Override
    public void call(String number) {
        System.out.println(number + "로 전화를 겁니다.");
    }
}
