package com.datastructure;

public class AVLSet<E extends Comparable<E>> implements SetInterface<E> {

    private AVLTree<E, Object> avl;

    public AVLSet(){
        avl = new AVLTree<>();
    }

    @Override
    public int getSize(){
        return avl.getSize();
    }

    @Override
    public boolean isEmpty(){
        return avl.isEmpty();
    }

    @Override
    public void add(E e){
        avl.add(e, null);
    }

    @Override
    public void remove(E e){
        avl.remove(e);
    }

    @Override
    public boolean contain(E e) {
        return avl.contains(e);
    }
}