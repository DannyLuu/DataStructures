package com.datastructures.stacks;

import java.util.EmptyStackException;

/**
 * <b>Interview Question - Stacks and Queues</b><br/>
 * <b>3.5</b>
 * Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use an additional
 * temporary stack, but you may not copy the elements into any other data structure (such as an array). The stack
 * supports the following operations: push, pop, peek, and isEmpty.
 */
public class SortedStack {
    Stack<Integer> stack;

    public void push(int value) {
        if (stack == null) {
            stack = new Stack<>();
          //  stack.push(value);
        }

        Stack<Integer> intermediateStack = new Stack<>();

        try {
            while (!stack.isEmpty() && stack.peek() < value ) {
                intermediateStack.push(stack.pop());
            }
        } catch (Exception e) {
            System.out.println("Boo yeah!");
        }

        stack.push(value);
        while (!intermediateStack.isEmpty()) {
            stack.push(intermediateStack.pop());
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.peek();
    }

    public boolean isEmpty() {
        return stack == null || stack.isEmpty();
    }
}
