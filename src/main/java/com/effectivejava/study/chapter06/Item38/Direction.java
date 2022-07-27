package com.effectivejava.study.chapter06.Item38;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Direction {

    private final String location;

    public static final Direction NORTH = new Direction("NORTH");
    public static final Direction SOUTH = new Direction("SOUTH");
    public static final Direction EAST = new Direction("EAST");
    public static final Direction WEST = new Direction("WEST");

    public Direction(String location) {
        this.location = location;
    }
}
