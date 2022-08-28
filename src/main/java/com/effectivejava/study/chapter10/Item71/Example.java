package com.effectivejava.study.chapter10.Item71;

import javax.management.BadAttributeValueExpException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Example {

    public static void main(String[] args) {

        try {
            ThrowCheckedException("");
        } catch (BadAttributeValueExpException | IOException e) {
            e.printStackTrace();
        }

    }

    public static void ThrowCheckedException(String name) throws BadAttributeValueExpException, IOException {
        if (name.isBlank()) {
            throw new BadAttributeValueExpException("name에 아무값도 포함되어 있지 않습니다.");
        }
        if (name.isEmpty()) {
            throw new IOException("name은 공백으로만 이루어질 수 없습니다.");
        }
    }
}
