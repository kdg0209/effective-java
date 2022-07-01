package com.effectivejava.study.chapter01.item01;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    private Long id;
    private String name;
    private int age;

    public static Member createMember(Long id, String name, int age) {
        return Member.builder()
                .id(id)
                .name(name)
                .age(age)
                .build();
    }

    public static Member updateMember(Long id, String name) {
        return Member.builder()
                .id(id)
                .name(name)
                .build();
    }
}
