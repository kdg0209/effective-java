package com.effectivejava.study.chapter05.Item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserV2<T> {

    public final T[] choiceArray;

    public ChooserV2(Collection choiceArray) {
        // 컴파일 에러 방지를 위한 T[] 배열로 형변환
        this.choiceArray = (T[]) choiceArray.toArray();
    }

    public Object choose() {
        Random random = ThreadLocalRandom.current();
        return choiceArray[random.nextInt(choiceArray.length)];
    }
}
