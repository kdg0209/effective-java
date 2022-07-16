package com.effectivejava.study.chapter03.Item23;

public class Figure {

    enum Shape {
        RECTANGLE, CIRCLE
    }

    // 공통 필드
    final Shape shape;

    double length;
    double width;
    double radius;

    public Figure(double radius) {
        this.shape = Shape.CIRCLE;
        this.radius = radius;
    }

    public Figure(double length, double width) {
        this.shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (this.shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
