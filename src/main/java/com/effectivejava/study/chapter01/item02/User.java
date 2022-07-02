package com.effectivejava.study.chapter01.item02;


public class User {

    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String address;

    private User (Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public static class Builder {

        // 필수 매개 변수
        private final int id;
        private final String name;
        private final int age;

        // 선택 매개변수 - 기본값으로 초기화
        private String phoneNumber = null;
        private String address = null;

        public Builder(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Builder phoneNumber(String val) {
            this.phoneNumber = val;
            return this;
        }

        public Builder address(String val) {
            this.address = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
