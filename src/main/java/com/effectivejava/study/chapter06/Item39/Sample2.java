package com.effectivejava.study.chapter06.Item39;

public class Sample2 {

    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i / i; // divide by zero. ArithmeticException 예외를 발생시킴 -> 성공
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] ints = new int[0];
        int i = ints[0]; // IndexOutOfBoundsException 발생 -> ArithmeticException가 아니므로 실패
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {} // 아무 Exception도 발생하지 않음 -> 실패
}
