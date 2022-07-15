package com.effectivejava.study.chapter03.Item20;

public interface SongWriter {

    default void write() {
        System.out.println("작곡을 합니다.");
    }
}
