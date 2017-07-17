package com.datastructures.stacks;

import java.util.EmptyStackException;

/**
 * <b>Interview Question - Stacks and Queues</b><br/>
 * <b>3.3</b>
 * Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in
 * real life, we would likely start a new stack when the previous stack exceeds some threshold. Implement a data
 * structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a new
 * stack once the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should behave
 * identically to a single stack (that is, pop() should return the same values as it would if there were just a
 * single stack).
 * <br/>
 * FOLLOW UP
 * <br/>
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
 */
public class SetOfStacks {
    private final int capacity;
    private PlateStack topStack;

    private static class PlateNode {
        int data;
        PlateNode next;

        public PlateNode(int value) {
            this.data = value;
        }

        public void setNext(PlateNode next) {
            this.next = next;
        }
    }

    private static class PlateStack {
        final int maxStackSize;
        int currSize;
        PlateStack nextPlateStack;
        PlateNode top;

        public PlateStack(int maxStackSize) {
            this.maxStackSize = maxStackSize;
            currSize = 0;
        }

        public boolean hasSpace() {
            return currSize < maxStackSize;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public void push(int value) {
        PlateNode node = new PlateNode(value);

        // Top stack is null.
        if (topStack == null) {
            System.out.println("Top stack is null, creating a new stack.");
            PlateStack stack = new PlateStack(capacity);
            topStack = stack;
        }

        if (topStack.isEmpty()) {
            // Top stack is null null.
            System.out.println("Topstacks' top node is null, creating new top node");

        } else if (topStack.hasSpace()) {
            // If the top stack has space, add the node.
            System.out.println("Topstack still has space, adding node.");
            node.next = topStack.top;
        } else {
            // Top stack is full, don't want to topple that shizzz. Create a new stack
            System.out.println("Top stack is full, creating new stack and adding node to the top!");
            PlateStack stack = new PlateStack(capacity);
            stack.nextPlateStack = topStack;
            topStack = stack;
        }
        topStack.top = node;
        topStack.currSize++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int value = topStack.top.data;

        if (topStack.top.next == null) {
            topStack = topStack.nextPlateStack;
        } else {
            topStack.top = topStack.top.next;
            topStack.currSize--;
        }

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return topStack.top.data;
    }

    public boolean isEmpty() {
        return topStack == null || topStack.top == null;
    }

    /**
     * Performs a pop operation on a specific sub-stack.
     *
     * @param index
     * @return
     */
    public int popAt(int index) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        PlateStack prevStack = null;
        PlateStack currStack = topStack;

        while (index > 0) {
            if (currStack.nextPlateStack == null) {
                throw new IndexOutOfBoundsException();
            }

            prevStack = currStack;
            currStack = currStack.nextPlateStack;

            if (currStack.isEmpty()) {
                throw new EmptyStackException();
            }

            index--;
        }

        int value = currStack.top.data;
        currStack.top = currStack.top.next;
        currStack.currSize--;

        // If the popped stack is empty, collapse this stack and combine the previous stack and next stack.
        if (currStack.top == null) {
            prevStack.nextPlateStack = currStack.nextPlateStack;
        }

        return value;
    }
}
