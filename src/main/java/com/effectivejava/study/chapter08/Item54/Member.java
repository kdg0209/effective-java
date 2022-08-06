package com.effectivejava.study.chapter08.Item54;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ToString
public class Member {

    private static List<Member> members = new ArrayList<>();
    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public static void add(Member member) {
        members.add(member);
    }

    public static List<Member> getMembers() {
        if (members.isEmpty()) {
            return Collections.emptyList();
        }
        return new ArrayList<>(members);
    }
}
