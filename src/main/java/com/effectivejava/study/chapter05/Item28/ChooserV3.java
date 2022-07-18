package com.effectivejava.study.chapter05.Item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserV3<T> {

    private final List<T> choiceList;

    public ChooserV3(Collection<T> choiceList) {
        this.choiceList = new ArrayList<>(choiceList);
    }

    public Object choose() {
        Random random = ThreadLocalRandom.current();
        return choiceList.get(random.nextInt(choiceList.size()));
    }
}
