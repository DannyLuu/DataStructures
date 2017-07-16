package com.datastructures.stacks;

import java.util.EmptyStackException;

/**
 * <b>Interview Question - Stacks and Queues</b><br/>
 * <b>2.1</b>
 * Three in One: Describe how you could use a single array to implement three stacks.
 * <p>
 * This implementation of three stacks using a single array will have a fixed division for each stack.
 */
public class FixedMultiStack {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack(int stackSize) {
        this.stackCapacity = stackSize;
        values = new int[stackCapacity * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    public void push(int stack, int data) {
        if (stack > 2) {
            throw new IndexOutOfBoundsException();
        }
        if (sizes[stack] >= stackCapacity) {
            throw new StackOverflowError();
        }

        values[(stack * stackCapacity) + sizes[stack]] = data;
        sizes[stack]++;
    }

    public int pop(int stack) {
        if (stack > 2) {
            throw new IndexOutOfBoundsException();
        }
        if (sizes[stack] == 0) {
            throw new EmptyStackException();
        }

        int data = values[(stack * stackCapacity) + sizes[stack] - 1];
        values[(stack * stackCapacity) + sizes[stack] - 1] = 0;
        sizes[stack]--;

        return data;
    }

    public int peek(int stack) {
        if (stack > 2) {
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty(stack)) {
            throw new EmptyStackException();
        }
        int data = values[(stack * stackCapacity) + sizes[stack] - 1];
        return data;
    }

    public boolean isEmpty(int stack) {
        if (stack > 2) {
            throw new IndexOutOfBoundsException();
        }
        return sizes[stack] == 0;
    }
}
