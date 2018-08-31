package com.datastructure;

public interface SetInterface<E> {

    void add(E e);
    void remove(E e);
    boolean contain(E e);
    int getSize();
    boolean isEmpty();
}
