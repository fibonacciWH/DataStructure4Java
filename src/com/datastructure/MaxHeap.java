package com.datastructure;

//最大堆的性质 ：1.完全二叉树 2.父节点大于子节点
public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap() {
        data = new Array<>();
    }

    //heapify算法复杂度
    //将n个元素逐一插入到一个空堆中，算法复杂度是O(nlogn)
    //heapify的过程，算法复杂度为O(n)
    public MaxHeap(E[] arr) {
        data = new Array<>(arr);
        for (int i = parent(arr.length - 1); i >= 0; i--) {
            siftDown(i);
        }
    }

    //返回堆的元素个数
    public int size() {
        return data.getSize();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    //返回完全二叉树的数组表示中，一个索引表示的元素的父亲节点的索引
    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index-0 doesn't hava parent");
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    //向堆中添加元素
    public void add(E e) {
        data.addLast(e);
        siftUp(data.getSize() - 1);
    }

    private void siftUp(int k) {
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    // 看堆中的最大元素
    public E findMax() {
        if (data.getSize() == 0) {
            throw new IllegalArgumentException("can not find max when heap us empty!");
        }
        return data.get(0);
    }

    //从堆中取出最大元素
    public E extractMax() {
        E ret = findMax();

        //将队首元素（最大元素）换到队尾
        data.swap(0, data.getSize() - 1);
        //删除最大元素
        data.removeLast();
        siftDown(0);

        return ret;
    }

    private void siftDown(int k) {
        while (leftChild(k) < data.getSize()) {
            int j = leftChild(k);
            if (j + 1 < data.getSize() && data.get(j + 1).compareTo(data.get(j)) > 0) {
                j = rightChild(k);
            }
            //data[j]是leftChild和rightChild中的最大值

            if (data.get(k).compareTo(data.get(j)) >= 0) {
                break;
            }

            data.swap(k, j);
            k = j;
        }
    }

    //取出堆中的最大元素，并且替换成e
    public E replace(E e) {
        E ret = findMax();
        data.set(0, e);
        siftDown(0);
        return ret;
    }
}
