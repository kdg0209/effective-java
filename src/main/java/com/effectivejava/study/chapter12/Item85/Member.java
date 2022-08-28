package com.effectivejava.study.chapter12.Item85;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String phone;
}
