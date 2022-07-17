package com.effectivejava.study.chapter05.Item26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Foods {

    private final List<Food> foods = new ArrayList();

    public void add(Food o) {
        foods.add(o);
    }

    public void print() {
        Iterator iterator = foods.iterator();

        while (iterator.hasNext()) {
            Food food = (Food) iterator.next(); // ClassCastException 발생
            System.out.println("food : " + food);
        }
    }
}
