package com.effectivejava.study.chapter07.Item47;

import com.fasterxml.jackson.databind.util.ArrayIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Example {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("A", "C", "D");
        List<String> list = Arrays.asList("A", "C", "D");

        for (String s : iterableOf(stream)) {
            System.out.println(s);
        }

        streamOf(list).forEach(System.out::println);


    }

    // return For-each
    public static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }

    // return Stream
    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
