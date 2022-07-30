package com.effectivejava.study.chapter07.Item43;

import java.util.ArrayList;
import java.util.List;

public class FoodSaveForm {

    private final List<Food> foods = new ArrayList<>();

    public void save(Food food) {
        foods.add(food);
    }
}
