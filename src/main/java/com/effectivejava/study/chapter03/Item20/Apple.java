package com.effectivejava.study.chapter03.Item20;

public class Apple implements Food, Comparable<Apple> {

    private final String name;
    private final int price;

    public Apple(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Apple o) {
        return Integer.compare(this.price, o.price);
    }
}
