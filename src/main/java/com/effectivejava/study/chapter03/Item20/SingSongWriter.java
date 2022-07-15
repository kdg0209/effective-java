package com.effectivejava.study.chapter03.Item20;

public interface SingSongWriter extends Singer, SongWriter {

    @Override
    default void sing(String name) {
        // 새로운 행위
    }

    @Override
    default void write() {
        // 새로운 행위
    }
}
