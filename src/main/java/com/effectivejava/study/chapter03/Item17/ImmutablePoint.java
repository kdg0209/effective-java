package com.effectivejava.study.chapter03.Item17;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class ImmutablePoint {

    private final double x;
    private final double y;

    private ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static ImmutablePoint valueOf(double x, double y) {
        return new ImmutablePoint(x, y);
    }
}
