package com.effectivejava.study.chapter06.Item34;

public enum OperationV2 {

    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MiNUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    public abstract double apply(double x, double y);
}
