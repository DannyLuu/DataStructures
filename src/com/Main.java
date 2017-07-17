package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.stacks.SetOfStacks;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks(2);

        System.out.println("is SetOfStacks empty? " + setOfStacks.isEmpty());
        setOfStacks.push(10);
        setOfStacks.push(9);
        setOfStacks.push(8);
        setOfStacks.push(7);
        setOfStacks.push(6);
        setOfStacks.push(5);

        System.out.println("is SetOfStacks empty? " + setOfStacks.isEmpty());
        System.out.println("Popping stack 1: " + setOfStacks.popAt(1));
        System.out.println("Popping stack 1: " + setOfStacks.popAt(1));
        System.out.println("Popping stack 1: " + setOfStacks.popAt(1));
        System.out.println("Popping stack 1: " + setOfStacks.popAt(1));
        System.out.println("Popping stack: " + setOfStacks.pop());
        System.out.println("Popping stack: " + setOfStacks.pop());
        System.out.println("is SetOfStacks empty? " + setOfStacks.isEmpty());
    }
}
