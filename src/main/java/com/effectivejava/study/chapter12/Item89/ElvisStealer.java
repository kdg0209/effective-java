package com.effectivejava.study.chapter12.Item89;

import java.io.Serializable;

public class ElvisStealer implements Serializable {

    static Elvis impersonator;
    private Elvis payload;

    private Object readResolve() {
        // resolve가 되기전 Elvis 인스턴스 참조를 저장
        impersonator = payload;
        return new String[] {"C"};
    }
}
