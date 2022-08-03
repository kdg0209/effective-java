package com.effectivejava.study.chapter03.Item18;

import lombok.Getter;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Getter
public class CompositionSet<T> {

    private Set<T> set;
    private int addCount = 0;

    public CompositionSet() {
        this.set = new HashSet<>();
    }

    public boolean add(T e) {
        addCount++;
        return this.set.add(e);
    }

    public boolean addAll(Collection<? extends  T> e) {
        addCount += e.size();
        return this.set.addAll(e);
    }
}
