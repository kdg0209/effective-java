package com.effectivejava.study.chapter05.Item32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GenericVarargs {

    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(b, c);
            case 2: return toArray(a, c);
        }
        throw new AssertionError(); //도달할 수 없다.
    }

    static void dangerous(List<String>... stringLists) {
        List<Integer> intLists = List.of(42);

        Object[] objects = stringLists;
        objects[0] = intLists;            // 힙 오염
        String s = stringLists[0].get(0); // ClassCastException
    }

    public static void printVarargs(String... strings) {
        System.out.println(strings.getClass().getSimpleName());

        System.out.println("-----------------");
        for(String s : strings) {
            System.out.println(s);
        }

    }

    public static void printVarargsGeneric(List<String>... strings) {
        System.out.println(strings.getClass().getSimpleName());

        System.out.println("-----------------");
        Arrays.stream(strings).forEach(System.out::println);

    }

    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }
}
