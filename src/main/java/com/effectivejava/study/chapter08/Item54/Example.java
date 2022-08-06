package com.effectivejava.study.chapter08.Item54;

import java.util.List;
import java.util.Objects;

public class Example {

    public static void main(String[] args) {
//        Member.add(new Member("홍길동"));
//        Member.add(new Member("이순신"));
//        Member.add(new Member("유관순"));

        List<Member> members = Member.getMembers();
        members.forEach(System.out::println);

    }
}
