package com.effectivejava.study.chapter07.Item43;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

    public static void main(String[] args) {

        List<String > strings = Arrays.asList(
                "10",
                "20"
        );

        strings.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);

        strings.stream()
                .map(item -> Integer.parseInt(item))
                .forEach(System.out::println);


    }
}
