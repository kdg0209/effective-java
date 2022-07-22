package com.effectivejava.study.chapter05.Item31;

import java.util.*;

public class Stack<E> {

    private E[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E o) {
        ensureCapacity();
        elements[size++] = o;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public Collection<E> popAll(Collection<? super E> o) {
        while (size != 0) {
            E result = elements[--size];
            elements[size] = null;
            o.add(result);
        }
        return (Collection<E>) o;
    }

    public void pushAll(Iterable<? extends E> src) {
        for(E e : src) push(e);
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
