package com.effectivejava.study.chapter08.Item51;


public class Example {

    ButtonType button;

    private static final int arr[] = {1, 2, 3, 4};

    public static void main(String[] args) {
        System.out.println(find(1, 3, 2)); // 1 반환 2는 1번째 위치에 있으므로

    }
    private static int find(int start, int end, Object element) {
        int o = (int) element;
        for (int i = start; i < end; i++) {
            if (arr[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public void changeSwitch(boolean on) {
        if (on) {
//            this.button = true;
//            onLight();
        } else {
//            this.button = false;
//            offLight();
        }
    }

    public enum ButtonType {
        ON, OFF
    }

    public void changeSwitch(ButtonType type) {
        if (ButtonType.ON == type) {
            this.button = type;
//            onLight();
        } else {
            this.button = type;
//            offLight();
        }
    }
}
