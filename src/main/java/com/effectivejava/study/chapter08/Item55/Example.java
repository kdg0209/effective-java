package com.effectivejava.study.chapter08.Item55;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        Optional<String> word = Optional.ofNullable("HELLO");
        String s = word.get();
        System.out.println(s);

    }

//    public static <E extends Comparable<E>> E max(Collection<E> c) {
//        if (c.isEmpty()) {
//            throw new IllegalArgumentException("빈 컬렉션");
//        }
//
//        E result = null;
//        for (E e : c) {
//            if (result == null || e.compareTo(result) > 0) {
//                result = Objects.requireNonNull(e);
//            }
//        }
//
//        return result;
//    }
//
//    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
//        if (c.isEmpty()) return Optional.empty();
//
//        E result = null;
//        for (E e : c) {
//            if (result == null || e.compareTo(result) > 0) {
//                result = Objects.requireNonNull(e);
//            }
//        }
//
//        return Optional.of(result);
//    }
}
