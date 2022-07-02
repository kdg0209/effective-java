package com.effectivejava.study.chapter01.item05;

public class ShoppingServiceV2 {

    private static final DiscountPolicy discountPolicy = new DiscountPolicy(1000);
    private static ShoppingServiceV2 instance = new ShoppingServiceV2();

    private ShoppingServiceV2() {}

    private static ShoppingServiceV2 getInstance() {
        return instance;
    }

    public static ShoppingResponse buy(Product product, int money) {

        if (!product.isPayable(money)) {
            return null;
        }

        int resultPrice = discountPolicy.discount(product.getPrice());
        return ShoppingResponse.of(product, resultPrice);
    }
}
