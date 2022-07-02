package com.effectivejava.study.chapter01.item05;

public class ShoppingServiceV3 {

    private final DiscountPolicy discountPolicy;

    public ShoppingServiceV3(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public ShoppingResponse buy(Product product, int money) {

        if (!product.isPayable(money)) {
            return null;
        }

        int resultPrice = discountPolicy.discount(product.getPrice());
        return ShoppingResponse.of(product, resultPrice);
    }
}
