package com.effectivejava.study.chapter09.Item62;

public class Compound {

    private CompoundKey compoundKey;

    private static class CompoundKey {
        private String className;
        private String delimiter;
        private int index;

        public CompoundKey(String className, String delimiter, int index) {
            this.className = className;
            this.delimiter = delimiter;
            this.index = index;
        }
    }
}
