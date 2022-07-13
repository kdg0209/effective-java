package com.effectivejava.study.chapter03.Item18;

import lombok.Getter;

import java.util.Collection;
import java.util.Set;


@Getter
public class CompositionInstrumentedSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public CompositionInstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
}
