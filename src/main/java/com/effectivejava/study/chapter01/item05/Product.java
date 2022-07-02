package com.effectivejava.study.chapter01.item05;

import lombok.Data;

@Data
public class Product {

    private String name;
    private int price;

    public boolean isPayable(int money) {
        return price <= money;
    }
}
