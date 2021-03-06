package com.datastructures.stacks;

import java.util.EmptyStackException;

/**
 * Created by Hisoka on 2017-07-15.
 */
public class Stack<T> {

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    /**
     * Remove the first item off the top of the stack.
     * @return
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T item = top.data;
        top = top.next;
        return item;
    }

    /**
     * Add an item to the top of the stack.
     * @param item
     */
    public void push(T item) {
        StackNode<T> node = new StackNode<T>(item);
        node.next = top;
        top = node;
    }

    /**
     * Return the top node in the stack.
     * @return
     */
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    /**
     * Return true only if stack is empty.
     * @return
     */
    public boolean isEmpty() {
        return top == null;
    }
}
