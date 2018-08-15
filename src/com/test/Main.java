package com.test;

import com.datastructure.Array;
import com.datastructure.ArrayQueue;
import com.datastructure.ArrayStack;

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

        ArrayQueue<Integer> queue = new ArrayQueue<>();

        for(int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if(i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
