package com.effectivejava.study.chapter09.Item63;

public class Example {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }

        System.out.println(sb.toString()); // 2 sec, 803ms 소요
    }
}
