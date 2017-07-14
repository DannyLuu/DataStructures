package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.lists.LinkedList;
import com.datastructures.lists.Node;

import static org.junit.Assert.assertEquals;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        Main program = new Main();
        //program.sumListsBackwards();
        //program.sumListsForwards();
        //program.checkIfElementsInLinkedListIsAPalindrome();

        program.findLinkedListIntersection();

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

        System.out.println(linkedListAlgorithms.isPalindrome(linkedList));
    }

    public void findLinkedListIntersection() {
        // Generating nodes for first list.
        Node<String> node1 = new Node<>("a");
        Node<String> node2 = new Node<>("b");
        Node<String> node3 = new Node<>("c");
        Node<String> node4 = new Node<>("d");
        Node<String> node5 = new Node<>("e");
        Node<String> node6 = new Node<>("f");

        // Generating nodes for second list.
        Node<String> node7 = new Node<>("1");
        Node<String> node8 = new Node<>("2"); // Intersecting Node
        Node<String> node9 = new Node<>("3");
        Node<String> node10 = new Node<>("4");
        Node<String> node11 = new Node<>("5");
        Node<String> node12 = new Node<>("6");
        Node<String> node13 = new Node<>("7");
        Node<String> node14 = new Node<>("9");
        Node<String> node15 = new Node<>("10");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node8);

        node7.setNext(node8);
        node8.setNext(node9);
        node9.setNext(node10);
        node10.setNext(node11);
        node11.setNext(node12);
        node12.setNext(node13);
        node13.setNext(node14);
        node14.setNext(node15);

        LinkedList<String> firstList = new LinkedList<>();
        firstList.setHead(node1);
        LinkedList<String> secondList = new LinkedList<>();
        secondList.setHead(node7);

        Node intersectingNode = linkedListAlgorithms.findIntersection(firstList, secondList);

        assertEquals(node8, intersectingNode);
        System.out.println(node8 == intersectingNode);
    }
}
