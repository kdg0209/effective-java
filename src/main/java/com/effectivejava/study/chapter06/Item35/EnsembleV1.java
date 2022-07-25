package com.effectivejava.study.chapter06.Item35;

public enum EnsembleV1 {

    SOLO, DUET, TRIO, QUARTET,
    QUINTET, SEXTET, SEPTET,
    OCTET, NONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
