package com.effectivejava.study.chapter02.Item10;

public class SmellPoint extends Point {

    private final Smell smell;

    public SmellPoint(int x, int y, Smell smell) {
        super(x, y);
        this.smell = smell;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        // obj가 일반 Point이면 색상을 무시하고 x, y 정보만 비교합니다.
        if (!(obj instanceof SmellPoint)) {
            return obj.equals(this);
        }

        return super.equals(obj) && this.smell == ((SmellPoint) obj).smell;
    }
}
