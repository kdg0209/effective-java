package com.effectivejava.study.chapter02.Item14;

import lombok.ToString;

@ToString
public class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {

    private String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, o.s);
    }
}
