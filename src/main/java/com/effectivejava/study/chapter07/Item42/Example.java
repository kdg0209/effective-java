package com.effectivejava.study.chapter07.Item42;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("book", "apple", "car");

        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

//        Collections.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        System.out.println(strings); // [car, book, apple]
    }
}
