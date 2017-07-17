package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.stacks.SortedStack;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        SortedStack sortedStack = new SortedStack();

        System.out.println("Is sorted stack empty? " +  sortedStack.isEmpty());

        sortedStack.push(10);
        System.out.println(sortedStack.peek());
        sortedStack.push(12);
        System.out.println(sortedStack.peek());
        sortedStack.push(13);
        System.out.println(sortedStack.peek());
        sortedStack.push(14);
        System.out.println(sortedStack.peek());
        sortedStack.push(2);
        System.out.println(sortedStack.peek());
        sortedStack.push(1);
        System.out.println(sortedStack.peek());

        System.out.println();

        while (!sortedStack.isEmpty()) {
            System.out.println("Popping: " + sortedStack.pop());
        }
    }
}
