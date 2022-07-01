package com.effectivejava.study.chapter01.item01;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class AppleSmartPhone implements SmartPhone {

    private String name;
    private int version;

    @Override
    public SmartPhone init(String name, int version) {
        return new AppleSmartPhone(name, version);
    }
}
