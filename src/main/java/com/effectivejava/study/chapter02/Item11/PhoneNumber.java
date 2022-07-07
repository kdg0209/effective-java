package com.effectivejava.study.chapter02.Item11;

import java.util.Objects;

public class PhoneNumber {

    private int hashCode; // 자동으로 0으로 초기화

    private final String first;
    private final String second;
    private final String third;

    public PhoneNumber(String first, String second, String third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PhoneNumber)) return false;
        if (this == obj) return true;
        PhoneNumber phoneNumber = (PhoneNumber) obj;

        return Objects.equals(this.first, phoneNumber.first) &&
                Objects.equals(this.second, phoneNumber.second) &&
                Objects.equals(this.third, phoneNumber.third);
    }

    @Override
    public int hashCode() {
        if (hashCode != 0) return hashCode;

        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        result = 31 * result + third.hashCode();
        hashCode = result;
        return hashCode;
    }
}
