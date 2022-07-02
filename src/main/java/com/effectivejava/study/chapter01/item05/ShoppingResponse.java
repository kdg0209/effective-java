package com.effectivejava.study.chapter01.item05;

import lombok.Data;

@Data
public class ShoppingResponse {

    private final Product product;
    private final int price;

    public static ShoppingResponse of(Product product, int price) throws IllegalArgumentException {
        return new ShoppingResponse(product, price);
    }
}
