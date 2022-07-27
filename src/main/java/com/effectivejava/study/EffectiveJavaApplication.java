package com.effectivejava.study;

import com.effectivejava.study.chapter06.Item35.EnsembleV1;
import com.effectivejava.study.chapter06.Item35.EnsembleV2;
import com.effectivejava.study.chapter06.Item37.Plant;
import com.effectivejava.study.chapter06.Item38.Direction;
import com.effectivejava.study.chapter06.Item38.ExtendedOperation;
import com.effectivejava.study.chapter06.Item38.Operation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws Exception {

        double x = 4;
        double y = 2;
        testV2(Arrays.asList(ExtendedOperation.values()), x ,y);
    }

    private static <T extends Enum<T> & Operation> void test(Class<T> enumType, double x, double y) {

        for (Operation o : enumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, o, y, o.apply(x, y));
        }
    }

    private static void testV2(Collection<? extends Operation> operations, double x, double y) {
        for (Operation o : operations) {
            System.out.printf("%f %s %f = %f%n", x, o, y, o.apply(x, y));
            // 4.000000 ^ 2.000000 = 16.000000
            // 4.000000 % 2.000000 = 0.000000
        }
    }
}










