package com.effectivejava.study.chapter11.Item79;

import java.util.HashSet;

public class Example {

    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                System.out.println(element);

                // 값이 23이라면 자신을 구독해지
                // this를 넘겨주어야하기 때문에 람다가 아닌 익명객체 사용
                if (element == 23) set.removeObserver(this);
            }
        });

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }
}
