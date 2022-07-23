package com.effectivejava.study;

import com.effectivejava.study.chapter01.item09.StringUtils;
import com.effectivejava.study.chapter02.Item13.Product;
import com.effectivejava.study.chapter02.Item13.Products;
import com.effectivejava.study.chapter02.Item14.CaseInsensitiveString;
import com.effectivejava.study.chapter03.Item16.ColorPoint;
import com.effectivejava.study.chapter03.Item16.Points;
import com.effectivejava.study.chapter03.Item17.ImmutablePoint;
import com.effectivejava.study.chapter03.Item17.Point;
import com.effectivejava.study.chapter03.Item18.CompositionInstrumentedSet;
import com.effectivejava.study.chapter03.Item18.InstrumentedHashSet;
import com.effectivejava.study.chapter03.Item19.Sub;
import com.effectivejava.study.chapter03.Item20.Calculator;
import com.effectivejava.study.chapter03.Item20.CalculatorImpl;
import com.effectivejava.study.chapter03.Item24.OuterClass;
import com.effectivejava.study.chapter03.Item25.Apple;
import com.effectivejava.study.chapter05.Item26.Foods;
import com.effectivejava.study.chapter05.Item26.Weapon;
import com.effectivejava.study.chapter05.Item29.Food;
import com.effectivejava.study.chapter05.Item29.GenericStack;
import com.effectivejava.study.chapter05.Item29.ObjectStack;
import com.effectivejava.study.chapter05.Item31.Stack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.effectivejava.study.chapter03.Item24.OuterClass.StaticInnerClass;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.UnaryOperator;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws Exception {
//        dangerous(List.of("a", "b", "c"));
//        printVarargs("a", "b", "c", "d");
//        System.out.println();
//        printVarargsGeneric(List.of("a", "b", "c", "d"));
//
//        Object[] strings = pickTwo("one", "two", "three");
//        System.out.println("strings = " + strings);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        flatten(list1, list2).forEach(System.out::println);

    }

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










