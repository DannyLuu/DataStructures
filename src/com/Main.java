package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.stacks.FixedMultiStack;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        // Fixed 3 multi-stack with size 10 per stack.
        FixedMultiStack multiStack = new FixedMultiStack(10);

        System.out.println("Is stack 0 empty? " + multiStack.isEmpty(0));
        System.out.println("Is stack 1 empty? " + multiStack.isEmpty(1));
        System.out.println("Is stack 2 empty? " + multiStack.isEmpty(2));

        multiStack.push(0, 1);
        multiStack.push(0, 2);
        multiStack.push(0, 3);
        multiStack.push(0, 4);
        multiStack.push(0, 5);
        multiStack.push(0, 6);
        multiStack.push(0, 7);
        multiStack.push(0, 8);
        multiStack.push(0, 9);
        multiStack.push(0, 10);

        multiStack.push(1, 20);
        multiStack.push(1, 21);
        multiStack.push(1, 22);
        multiStack.push(1, 23);
        multiStack.push(1, 24);
        multiStack.push(1, 25);
        multiStack.push(1, 26);
        multiStack.push(1, 27);
        multiStack.push(1, 28);
        multiStack.push(1, 29);

        multiStack.push(2, 50);
        multiStack.push(2, 51);
        multiStack.push(2, 52);
        multiStack.push(2, 53);
        multiStack.push(2, 54);
        multiStack.push(2, 55);
        multiStack.push(2, 56);
        multiStack.push(2, 57);
        multiStack.push(2, 58);
        multiStack.push(2, 59);

        System.out.println("Peek stack 0: " + multiStack.peek(0));
        System.out.println("Peek stack 1: " + multiStack.peek(1));
        System.out.println("Peek stack 2: " + multiStack.peek(2));

        System.out.println("Pop stack 2: " + multiStack.pop(2));
        System.out.println("Peek stack 2: " + multiStack.peek(2));
        System.out.println("Pop stack 2: " + multiStack.pop(2));
        System.out.println("Pop stack 2: " + multiStack.pop(2));

        System.out.println("Pop stack 1: " + multiStack.pop(1));

        System.out.println("Pop stack 2: " + multiStack.pop(2));
        System.out.println("Pop stack 2: " + multiStack.pop(2));
        System.out.println("Pop stack 2: " + multiStack.pop(2));

        System.out.println("Pop stack 1: " + multiStack.pop(1));
    }
}
