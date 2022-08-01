package com.effectivejava.study.chapter07.Item48;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {
        primes().parallel()
                .map(p -> BigInteger.TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);
    }

    public static Stream<BigInteger> primes() {
        return Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
    }
}
