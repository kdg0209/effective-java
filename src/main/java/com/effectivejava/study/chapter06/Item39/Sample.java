package com.effectivejava.study.chapter06.Item39;

public class Sample {

    @KDGTest
    public static void m1() {} // 성공

    public static void m2() {} // 무시

    @KDGTest
    public static void m3() {
        throw new RuntimeException("fail"); // 실패
    }

    public static void m4() {} // 무시

    @KDGTest
    public void m5() {} // 무시 (잘못 사용된 예: static 메서드가 아님)

    public static void m6() {} // 무시

    @KDGTest
    public static void m7() {
        throw new RuntimeException("fail"); // 실패
    }

    public static void m8() {} // 무시
}
