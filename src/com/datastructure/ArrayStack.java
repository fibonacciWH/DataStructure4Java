package com.datastructure;

public class ArrayStack<E> implements StackInterface<E> {

    private Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayStack() {
        array = new Array<>();
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    //看一看栈顶远元素
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    public int getCatacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] Top");
        return res.toString();
    }
}
