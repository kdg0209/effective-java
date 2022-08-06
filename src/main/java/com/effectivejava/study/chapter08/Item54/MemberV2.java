package com.effectivejava.study.chapter08.Item54;

public class MemberV2 {

    private static Member[] members = new Member[16];

    public static Member[] getMembers() {
        if (members.length == 0) {
            return new Member[0];
        }
        return members;
    }
}
