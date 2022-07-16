package com.effectivejava.study.chapter03.Item20;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Setter
@Getter
@ToString
public abstract class AbstractWarrior implements Warrior {
    private String name;
    private int hp;
    private int mp;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Warrior)) return false;
//        Warrior that = (Warrior) o;
//        return Objects.equals(getHp(), that.getHp())
//                && Objects.equals(getMp(), that.getMp())
//                && Objects.equals(getName(), that.getName());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), getHp(), getMp());
//    }
}
