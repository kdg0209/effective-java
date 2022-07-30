package com.effectivejava.study.chapter07.Item44;

import java.util.Map;

@FunctionalInterface
public interface EldestEntryRemovalFunction<K, V> {

    boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);
}
