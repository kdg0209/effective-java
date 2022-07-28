package com.effectivejava.study.chapter06.Item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException{
        int tests = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("com.effectivejava.study.chapter06.Item39.Sample");

        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(KDGTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    System.out.println(m + " 실패: " + exc);
                } catch (Exception e) {
                    System.out.println("잘못 사용한 @KDGTest: " + m);
                }
            }
        }
        System.out.printf("성공: %d, 실패: %d%n", passed, tests-passed);
    }
}
