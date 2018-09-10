package com.datastructure;

public class UnionFindThree implements UF {

    private int[] parent;
    private int[] sz;  //以i为根的集合中的元素个数

    public UnionFindThree(int size) {
        parent = new int[size];
        sz = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
            sz[i] = 1;
        }
    }

    @Override
    public int getSize() {
        return parent.length;
    }

    //查看元素p和q是否所属于同一个集合
    //O（h）复杂度，h为树的高度
    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    //根据两个元素所在树的元素个数不同判断合并方向
    //将元素个数少的集合合并到元素个数多的集合上
    @Override
    public void unionElements(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) {
            return;
        }

        if (sz[pRoot] < sz[qRoot]) {
            parent[pRoot] = qRoot;
            sz[qRoot] += sz[qRoot];
        } else {
            parent[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
    }

    //查找过程，查找元素p所对应的集合编号
    //O（h）复杂度，h为树的高度
    private int find(int p) {
        if (p < 0 && p >= parent.length) {
            throw new IllegalArgumentException("p is out of bound");
        }
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }
}

