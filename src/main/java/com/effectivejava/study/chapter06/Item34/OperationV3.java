package com.effectivejava.study.chapter06.Item34;

public enum OperationV3 {

    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    OperationV3(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double x, double y);


    @Override
    public String toString() {
        return symbol;
    }
}
