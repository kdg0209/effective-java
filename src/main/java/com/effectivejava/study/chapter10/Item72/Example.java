package com.effectivejava.study.chapter10.Item72;

/**
 * @return: String
 * @throws: 이 클래스의 모든 메서드는 인수로 null이 넘어오면 NullPointerException이 발생합니다.
 */
public class Example {

    public static String methodV1(String name) {
        if (name == null) throw new NullPointerException();
        return name;
    }

    public static String methodV2(String name) {
        if (name == null) throw new NullPointerException();
        return name;
    }

    public static String methodV3(String name) {
        if (name == null) throw new NullPointerException();
        return name;
    }
}
