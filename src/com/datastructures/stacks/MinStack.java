package com.datastructures.stacks;

import java.util.EmptyStackException;

/**
 * <b>Interview Question - Stacks and Queues</b><br/>
 * <b>3.2</b>
 * Stack Min: How would you design a stack which, in addition to push and pop, has a function min which returns the
 * minimum element? Push, pop and min should all operate in 0(1) time.
 */
public class MinStack {

    private MinStackNode top;

    private static class MinStackNode {
        int data;
        MinStackNode relativeMinNode;
        MinStackNode next;

        public MinStackNode(int data) {
            this.data = data;
        }

        public void setRelativeMin(MinStackNode relativeMinNode) {
            this.relativeMinNode = relativeMinNode;
        }
    }

    public int getMin() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.relativeMinNode.data;
    }

    public void push(int value) {
        MinStackNode node = new MinStackNode(value);

        if (isEmpty()) {
            top = node;
            node.setRelativeMin(node);
        } else {
            node.next = top;

            if (value < top.relativeMinNode.data) {
                node.setRelativeMin(node);
            } else {
                node.setRelativeMin(top.relativeMinNode);
            }

            top = node;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
