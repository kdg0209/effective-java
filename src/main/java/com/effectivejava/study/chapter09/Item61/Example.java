package com.effectivejava.study.chapter09.Item61;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        Integer a = new Integer(42);
        Integer b = new Integer(42);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i = o1, j = o2; // 오토 박싱
                return (i < j) ? - 1 : (i == j ? 0 : 1);
            }
        };

        System.out.println(comparator.compare(a, b)); // 0
    }
}
