package com.effectivejava.study.chapter08.Item52;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {

    public static String method(Object o) {
        return "Object 메서드";
    }

    public static String method(Set<?> set) {
        return "Set 매개변수 메서드";
    }

    public static String method(List<?> list) {
        return "List 매개변수 메서드";
    }

    public static String method(Collection<?> collection) {
        return "Collection 매개변수 메서드";
    }
}
