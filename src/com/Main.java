package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.stacks.MinStack;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        System.out.println("Is min stack empty? " + minStack.isEmpty());

        minStack.push(10);
        System.out.println("Peek: " + minStack.peek());
        System.out.println("Min value = " + minStack.getMin());

        minStack.push(11);
        System.out.println("Peek: " + minStack.peek() + "\tMin value = " + minStack.getMin());

        minStack.push(9);
        System.out.println("Peek: " + minStack.peek() + "\tMin value = " + minStack.getMin());

        minStack.push(12);
        System.out.println("Peek: " + minStack.peek() + "\tMin value = " + minStack.getMin());

        System.out.println("pop: " + minStack.pop());
        System.out.println("Peek: " + minStack.peek() + "\tMin value = " + minStack.getMin());

        System.out.println("pop: " + minStack.pop());
        System.out.println("Peek: " + minStack.peek() + "\tMin value = " + minStack.getMin());
    }
}
