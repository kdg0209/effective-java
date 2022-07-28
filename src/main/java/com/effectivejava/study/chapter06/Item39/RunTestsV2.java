package com.effectivejava.study.chapter06.Item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTestsV2 {
    public static void main(String[] args) throws ClassNotFoundException{
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("com.effectivejava.study.chapter06.Item39.Sample2");
        for (Method m : testClass.getDeclaredMethods()) {
            tests++;

            try {
                m.invoke(null);
                System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
            } catch (InvocationTargetException e) {
                Throwable exc = e.getCause();
                Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
                if (excType.isInstance(exc)) {
                    passed++;
                } else {
                    System.out.printf("테스트 %s 실패: 기대한 예외 %s, 발생한 예외 %s%n", m, excType.getName(), exc);
                }
            } catch (Exception e) {
                System.out.println("잘못 사용한 @ExceptionTest: " + m);
            }
        }
        System.out.printf("성공: %d, 실패: %d%n", passed, tests-passed);
    }
}
