package com.effectivejava.study.chapter08.Item52;

public class Wine {

    String getName() {
        return "포도주";
    }
}

class SparklingWine extends Wine {

    @Override
    String getName() {
        return "발포성 포도주";
    }
}

class Champagne extends SparklingWine {

    @Override
    String getName() {
        return "샴페인";
    }
}