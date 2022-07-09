package com.effectivejava.study.chapter02.Item13;

import lombok.ToString;

@ToString
public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 복사 생성자
    public Product(Product product) {
        this.name = product.name;
        this.price = product.price;
    }

    // 복사 팩토리
    public static Product copyFactory (Product product) {
        return new Product(product.name, product.price);
    }
}
