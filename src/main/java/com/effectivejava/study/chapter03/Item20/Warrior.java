package com.effectivejava.study.chapter03.Item20;

public interface Warrior {

    void attack();

    void guard();

    void applyItem(Item item);

    default void taunt() {
        System.out.println("약올리기~");
    }
}
