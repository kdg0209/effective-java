package com.effectivejava.study.chapter09.Item62;

public class Example {

    public static void main(String[] args) {


    }

    // bad
    public static void typeV1(String fruitName) {

        if (fruitName.equals("apple")) {
            System.out.println("딸기");
        } else if (fruitName.equals("grape")) {
            System.out.println("포도");
        }
    }

    // good
    public static void typeV2(Fruit fruit) {

        if (fruit == Fruit.APPLE) {
            System.out.println("딸기");
        } else if (fruit == Fruit.GRAPE) {
            System.out.println("포도");
        }
    }

    enum Fruit {
        APPLE, GRAPE
    }
}
