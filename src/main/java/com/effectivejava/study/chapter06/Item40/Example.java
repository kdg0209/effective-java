package com.effectivejava.study.chapter06.Item40;

import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Set<Food> foods = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            foods.add(new Food(i, "피자 : " + i));
            for (int j = 0; j < 10; j++) {
                foods.add(new Food(j, "피자 : " + j));
            }
        }

        System.out.println(foods.size()); // 10
    }
}
