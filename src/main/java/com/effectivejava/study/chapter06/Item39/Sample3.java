package com.effectivejava.study.chapter06.Item39;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {

    @ExceptionTestV2({
            IndexOutOfBoundsException.class,
            NullPointerException.class
    })
    public static void m1() {
        List<String> list = new ArrayList<>();

        list.addAll(6, null);
    }
}
