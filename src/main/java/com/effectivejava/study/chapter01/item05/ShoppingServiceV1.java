package com.effectivejava.study.chapter01.item05;

public class ShoppingServiceV1 {
    private static final DiscountPolicy discountPolicy = new DiscountPolicy(1000);

    private ShoppingServiceV1() {}

    public static ShoppingResponse buy(Product product, int money) {

        if (!product.isPayable(money)) {
            return null;
        }

        int resultPrice = discountPolicy.discount(product.getPrice());
        return ShoppingResponse.of(product, resultPrice);
    }
}
