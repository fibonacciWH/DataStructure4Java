package com.datastructure;

public class LinkedListStack<E> implements StackInterface<E> {

    private LinkedList<E> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFist();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }

    //链表栈需要更多的new操作

    //链表栈和数组栈基本上是统一复杂度 需要具体问题具体分析
}
