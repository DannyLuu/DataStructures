package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.lists.LinkedList;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        Main program = new Main();
        program.sumListsBackwards();

    }

    public void sumListsBackwards() {
        LinkedList<Integer> firstList = new LinkedList<>();
        firstList.add(6);
        firstList.add(1);
        firstList.add(7);

        LinkedList<Integer> secondList = new LinkedList<>();
        secondList.add(2);
        secondList.add(9);
        secondList.add(5);

        System.out.println(linkedListAlgorithms.sumListsBackwards(firstList, secondList).toString());
    }
}
