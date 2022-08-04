package com.effectivejava.study.chapter08.Item51;

import java.util.Arrays;

public class Example2 {

    private static final int arr[] = {1, 2, 3, 4};

    public static void main(String[] args) {
        int[] subArray = subArray(1, 3);
        Example2.indexOf(2);
    }

    private static int[] subArray(int start, int end) {
        return Arrays.copyOfRange(arr, start, end);
    }

    private static int indexOf(Object element) {
        int o = (int) element;
        for (int i = 0; i < arr.length; i++) {
            if (i == o) {
                return i;
            }
        }
        return -1;
    }
}
