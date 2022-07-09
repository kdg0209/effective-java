package com.effectivejava.study.chapter02.Item13;

import lombok.ToString;

import java.util.Arrays;

@ToString
public class Products implements Cloneable {

    private static final int BUFFER_SIZE = 16;
    private Product[] products = new Product[BUFFER_SIZE];
    private int size;

    public void push(Product product) {
        ensureCapacity();
        products[size++] = product;
    }

    public Object pop() {
        if (size == 0) {
            throw new IllegalArgumentException();
        }

        Object result = products[--size];
        products[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (products.length == size) {
            products = Arrays.copyOf(products, 2 * size + 1);
        }
    }

    @Override
    public Products clone() {
        try {
            Products result = (Products) super.clone();
            result.products = new Product[this.products.length];

            int count = 0;
            for (int i = 0; i < this.size; i++) {
                Product copy = Product.copyFactory(this.products[i]);
                result.products[count++] = copy;
            }

            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
