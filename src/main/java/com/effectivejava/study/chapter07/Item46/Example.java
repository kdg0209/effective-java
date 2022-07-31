package com.effectivejava.study.chapter07.Item46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Example {



    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Long> map = LongStream.rangeClosed(0, 10)
                .boxed()
                .collect(Collectors.toMap(index -> "key" + index, index -> index));


        Map<String, Long> freq;
        String filePath = "src/main/java/com/effectivejava/study/chapter07/Item46/words.txt";

        try(Stream<String> words = new Scanner(new FileInputStream(filePath)).tokens()) {
            freq = words.collect(Collectors.groupingBy(String::toUpperCase, Collectors.counting()));

            List<String> topTen = freq.keySet().stream()
                    .sorted(Comparator.comparing(freq::get).reversed())
                    .limit(10)
                    .collect(Collectors.toList());

            topTen.forEach(System.out::println);
        }
    }
}
