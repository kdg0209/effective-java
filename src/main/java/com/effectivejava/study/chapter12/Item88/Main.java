package com.effectivejava.study.chapter12.Item88;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MutablePeriod mp = new MutablePeriod();
        Period p = mp.period;
        Date pEnd = mp.end;

        pEnd.setYear(78);
        System.out.println(p); // Period(start=Sat Aug 27 17:06:52 KST 2022, end=Sun Aug 27 17:06:52 KST 1978)

        pEnd.setYear(60);
        System.out.println(p); // Period(start=Sat Aug 27 17:06:52 KST 2022, end=Sat Aug 27 17:06:52 KDT 1960)
    }
}
