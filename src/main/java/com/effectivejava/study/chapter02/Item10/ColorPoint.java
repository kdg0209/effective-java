package com.effectivejava.study.chapter02.Item10;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        // obj가 일반 Point이면 색상을 무시하고 x, y 정보만 비교합니다.
        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }

        // obj가 ColorPoint이면 색상까지 비교합니다.
        return super.equals(obj) && this.color == ((ColorPoint) obj).color;
    }
}
