package com.effectivejava.study.chapter06.Item40;

public class Dog implements Animal {

    @Override
    public void eat() {

    }

    @Override
    public void breath() {

    }
}

interface Animal {

    void eat();
    void breath();
}
