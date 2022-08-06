package com.effectivejava.study.chapter08.Item53;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {

        varargs("H", "E", "L", "L", "O");
        minValueV2(1, 2, 3, 4, 5, 6);
    }

    public static void varargs(String... strings) {
        System.out.println(Arrays.toString(strings));
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void minValue(int... numbers) {

        if (numbers.length == 0) {
            throw new IllegalArgumentException();
        }

        int min = numbers[0];
        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
    }

    public static void minValueV2(int first, int... numbers) {
        int min = first;
        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
    }
}
