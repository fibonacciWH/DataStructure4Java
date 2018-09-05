package com.test;

import com.datastructure.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Array<Integer> array = new Array();
//
//        for (int i = 0; i < 10; i++) {
//            array.add(i, i);
//        }
//
//        array.addLast(11);
//
//        System.out.println(array.toString());
//
//        array.removeLast();
//
//        System.out.println(array.toString());
//
//        array.set(0, 100);
//
//        System.out.println(array.toString());
//
//        array.remove(2);
//
//        System.out.println(array.toString());
//
//        ArrayStack<Integer> stack = new ArrayStack<>();
//
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//
//        stack.pop();
//
//        System.out.println(stack);

//        String bracketsStr = "{[]}}";
//        System.out.println(BracketsTest.isBracketsVaild(bracketsStr));
//        String bracketsStr1 = "{[()]}";
//        System.out.println(BracketsTest.isBracketsVaild(bracketsStr1));

//        ArrayQueue<Integer> queue = new ArrayQueue<>();
//
//        for(int i = 0; i < 10; i++) {
//            queue.enqueue(i);
//            System.out.println(queue);
//
//            if(i % 3 == 2) {
//                queue.dequeue();
//                System.out.println(queue);
//            }
//        }

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 5; i++) {
//            linkedList.addFirst(i);
//            System.out.println(linkedList);
//        }
//        linkedList.add(2, 666);
//        System.out.println(linkedList);
//
//        linkedList.remove(2);
//        System.out.println(linkedList);
//
//        linkedList.removeFirst();
//        System.out.println(linkedList);
//
//        linkedList.removeLast();
//        System.out.println(linkedList);

//        LinkedListStack<Integer> stack = new LinkedListStack<>();
//
//        for(int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//
//        stack.pop();
//        System.out.println(stack);

//        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
//        for(int i = 0; i < 10; i++) {
//            queue.enqueue(i);
//            System.out.println(queue);
//
//            if(i % 3 == 2) {
//                queue.dequeue();
//                System.out.println(queue);
//            }
//        }

//        BST<Integer> bst = new BST<>();
//        int[] nums = {5, 3, 6, 8, 4, 2};
//        ///////////////////
//        //       5       //
//        //     /  \      //
//        //    3   6      //
//        //   / \   \     //
//        //  2  4   8     //
//        ///////////////////
//        for (int num : nums) {
//            bst.add(num);
//        }
//        bst.preOrder();
//        bst.preOrderNR();
//        bst.inOrder();
//        bst.postOrder();
//        bst.preOrderNR();
//        bst.levelOrder();


//        BST<Integer> bst = new BST<>();
//        Random random = new Random();
//
//        int n = 1000;
//
//        for (int i = 0; i < n; i++) {
//            bst.add(random.nextInt(10000));
//        }
//
//        List<Integer> nums = new ArrayList<>();
//        while (!bst.isEmpty()) {
//            nums.add(bst.removeMin());
//        }
//        System.out.println(nums);
//
//
//        for (int i = 1; i < nums.size(); i++) {
//            if (nums.get(i - 1) > nums.get(i)) {
//                throw new IllegalArgumentException("error");
//            }
//        }
//
//        System.out.println("removeMin success!");


//        int n = 1000000;
//
//        MaxHeap<Integer> maxHeap = new MaxHeap<>();
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
//        }
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = maxHeap.extractMax();
//        }
//
//        for (int i = 1; i < n; i++) {
//            if (arr[i - 1] < arr[i]) {
//                throw new IllegalArgumentException("Error");
//            }
//        }
//
//        System.out.println("Test MaxHeap completed.");

        Integer[] nums = {-2, 0, 3, -5, 2, -1};
//        SegmentTree<Integer> segTree = new SegmentTree<>(nums, new Merger<Integer>() {
//            @Override
//            public Integer merge(Integer a, Integer b) {
//                return a + b;
//            }
//        });
        SegmentTree<Integer> segTree = new SegmentTree<>(nums, (a, b) -> a + b);
//        System.out.println(segTree.toString());
        System.out.println(segTree.query(2, 5));
    }
}
