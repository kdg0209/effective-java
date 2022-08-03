package com.effectivejava.study.chapter08.Item50;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        period.getEnd().setYear(78);

        start.setYear(78); // period의 내부 수정이 가능합니다.
    }
}
