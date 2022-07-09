package com.effectivejava.study.chapter02.Item14;

public class PhoneNumber implements Comparable<PhoneNumber> {

    private final int first;
    private final int second;
    private final int third;

    public PhoneNumber(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int result = Integer.compare(this.first, o.first);
        if (result == 0) {
            result = Integer.compare(this.second, o.second);
            if (result == 0) {
                result = Integer.compare(this.third, o.third);
            }
        }
        return result;
    }
}
