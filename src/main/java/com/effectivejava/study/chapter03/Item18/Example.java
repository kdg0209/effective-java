package com.effectivejava.study.chapter03.Item18;

import java.util.List;

public class Example {

    public static void main(String[] args) {
        CompositionSet<String> set = new CompositionSet<>();
        set.addAll(List.of("hello", "java", "hard"));

        System.out.println(set.getAddCount()); // 6
    }
}
