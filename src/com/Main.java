package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.queues.QueueViaStacks;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        QueueViaStacks<String> queueViaStacks = new QueueViaStacks();

        System.out.println("Is queueViaStacks empty? " + queueViaStacks.isEmpty());
        System.out.println("Pushing hello");
        queueViaStacks.push("hello");
        System.out.println("Is queueViaStacks empty? " + queueViaStacks.isEmpty());
        queueViaStacks.push("yolo");
        queueViaStacks.push("swagg");
        queueViaStacks.push("Hard lyfe");
        queueViaStacks.push("black and yellow");

        while(!queueViaStacks.isEmpty()) {
            System.out.println("Removing... " + queueViaStacks.remove());
        }


    }
}
