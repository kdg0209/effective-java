package com.effectivejava.study.chapter01.item01;

public class SmartPhoneFactory {

    public static SmartPhone create(Type type) {
        SmartPhone smartPhone = null;

        if (type == Type.SAMSUNG) {
            smartPhone = new SamsungSmartPhone("갤럭시", 6);
        } else if (type == Type.APPLE) {
            smartPhone = new AppleSmartPhone("아이폰 미니", 12);
        }
        return smartPhone;
    }
}
