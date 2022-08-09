package com.effectivejava.study.chapter09.Item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        for (Integer num : number) {
            number.remove(num);
        }

        // case 1
        for (Iterator<Integer> i = number.iterator(); i.hasNext();) {
            Integer num = i.next();
            System.out.println(num);
        }

        // case 2
        for (int i = 0; i < number.size(); i++) {
            Integer num = number.get(i);
        }
    }
}
