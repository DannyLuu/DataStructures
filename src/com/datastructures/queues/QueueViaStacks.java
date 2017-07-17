package com.datastructures.queues;

import com.datastructures.stacks.Stack;

import java.util.EmptyStackException;

/**
 * <b>Interview Question - Stacks and Queues</b><br/>
 * <b>3.4</b>
 * Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.
 */
public class QueueViaStacks<T> {
    Stack<T> orderedStack;

    public void push(T value) {
        if (orderedStack == null) {
            orderedStack = new Stack<>();
        }

        if (orderedStack.isEmpty()) {
            orderedStack.push(value);
        } else {
            Stack<T> reversedStack = new Stack<>();
            while(!orderedStack.isEmpty()) {
                reversedStack.push(orderedStack.pop());
            }

            reversedStack.push(value);

            while(!reversedStack.isEmpty()) {
                orderedStack.push(reversedStack.pop());
            }
        }
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return orderedStack.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return null;
    }

    public boolean isEmpty() {
        return orderedStack == null || orderedStack.isEmpty();
    }
}
