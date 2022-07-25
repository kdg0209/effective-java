package com.effectivejava.study.chapter06.Item36;

import java.util.Set;

public class TextV2 {

    public enum Style {
        BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
    }

    //어떤 Set을 넣어도 되지만 EnumSet이 제일 좋다.
    public void applyStyles(Set<Style> styleSet) {

//        ...
    }
}
