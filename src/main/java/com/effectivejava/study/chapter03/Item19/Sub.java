package com.effectivejava.study.chapter03.Item19;

import java.time.Instant;

public class Sub extends Super {

    private final Instant instant;

    public Sub() {
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println("Sub override method! " + instant);
    }
}
