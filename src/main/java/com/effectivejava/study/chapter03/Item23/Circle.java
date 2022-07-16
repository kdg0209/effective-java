package com.effectivejava.study.chapter03.Item23;

public class Circle extends AbstractFigure {

    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
