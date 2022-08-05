package com.effectivejava.study.chapter08.Item52;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        integers.remove((Integer) 1);
        System.out.println(integers); // [2, 3, 4, 5]

        List<Wine> wines = List.of(
                new Wine(), new SparklingWine(), new Champagne()
        );

        for (Wine wine : wines) {
            System.out.println(wine.getName());
        }


        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<Integer>(),
                new HashMap<String, String>().values()
        };

        List<?> list = new ArrayList<>();
        System.out.println(CollectionClassifier.method(list));

        for (Collection<?> c: collections) {
            System.out.println(CollectionClassifier.method(c));
        }

        List<String> strings1 = new ArrayList<>(20);

        Set<String> set = new HashSet<>();
        set.add("Hello");
        List<String> strings2 = new ArrayList<>(set);
        System.out.println(strings2);
    }
}
