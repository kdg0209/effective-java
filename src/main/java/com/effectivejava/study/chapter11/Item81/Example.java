package com.effectivejava.study.chapter11.Item81;

import java.util.concurrent.ConcurrentHashMap;

public class Example {

    private static final ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    public static String internV1(String s) {
        String cacheValue = map.putIfAbsent(s, s);
        return  cacheValue == null ? s : cacheValue;
    }

    // ConcurrentHashMap은 get같은 검색에 최적화 되어 있기 때문에 아래 메서드가 더 빠릅니다.
    public static String internV2(String s) {
        String result = map.get(s);
        if (result == null) {
            result = map.putIfAbsent(s, s);
            if (result == null) {
                result = s;
            }
        }
        return result;
    }
}
