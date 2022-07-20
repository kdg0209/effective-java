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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.effectivejava.study.chapter03.Item24.OuterClass.StaticInnerClass;

import java.util.*;
import java.util.concurrent.CompletableFuture;


@SpringBootApplication
public class EffectiveJavaApplication {
    public static void main(String[] args) throws Exception {
        Stack<Double> stack = new Stack<>();


        ObjectStack objectStack = new ObjectStack();
        objectStack.push(new Food("피자"));
        objectStack.push("String");

        System.out.println(objectStack.pop()); // String
        System.out.println(objectStack.pop()); // Food 객체
    }
}






















