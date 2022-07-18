package com.effectivejava.study.chapter05.Item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser {

    private final Object[] choiceArray;

    public Chooser(Collection choiceArray) {
        this.choiceArray = choiceArray.toArray();
    }

    public Object choose() {
        Random random = ThreadLocalRandom.current();
        return choiceArray[random.nextInt(choiceArray.length)];
    }
}
