package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.lists.LinkedList;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        Main program = new Main();
        //program.sumListsBackwards();
        //program.sumListsForwards();
        program.checkIfElementsInLinkedListIsAPalindrome();

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

    public void sumListsForwards() {
        LinkedList<Integer> firstList = new LinkedList<>();
        firstList.add(7);
        firstList.add(1);
        firstList.add(6);

        LinkedList<Integer> secondList = new LinkedList<>();
        secondList.add(5);
        secondList.add(9);
        secondList.add(2);

        System.out.println(linkedListAlgorithms.sumListsForwards(firstList, secondList).toString());
    }

    public void checkIfElementsInLinkedListIsAPalindrome() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("t");
        linkedList.add("a");
        linkedList.add("c");
        linkedList.add("o");
        linkedList.add("c");
        linkedList.add("a");
        linkedList.add("t");

        System.out.println(linkedListAlgorithms.isLinkedListAPalindrome(linkedList));
    }
}
