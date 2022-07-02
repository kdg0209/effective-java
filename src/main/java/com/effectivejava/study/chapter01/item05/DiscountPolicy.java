package com.effectivejava.study.chapter01.item05;

import lombok.Data;

@Data
public class DiscountPolicy {

    private int discountPrice;

    public DiscountPolicy(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int discount(int price) {
        if (price < discountPrice) {
            return 0;
        }

        return price - discountPrice;
    }
}
