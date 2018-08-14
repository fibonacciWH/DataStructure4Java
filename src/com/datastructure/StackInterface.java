package com.datastructure;

public interface StackInterface<E> {

    E pop();

    E peek();

    void push(E e);

    boolean isEmpty();

    int getSize();
}
