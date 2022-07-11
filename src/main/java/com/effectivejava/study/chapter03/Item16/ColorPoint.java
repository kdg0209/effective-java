package com.effectivejava.study.chapter03.Item16;

import lombok.ToString;

public class ColorPoint {

    @ToString
    private static class Point {
        public double x;
        public double y;
    }

    public Point getPoint() {
        Point point = new Point();
        point.x = 1.2;
        point.y = 1.5;

        return point;
    }
}
