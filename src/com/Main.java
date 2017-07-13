package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.lists.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("f");
        linkedList.add("e");
        linkedList.add("d");
        linkedList.add("c");
        linkedList.add("b");
        linkedList.add("a");

        System.out.println(linkedList.toString());
        linkedListAlgorithms.deleteMiddleNode(linkedList);
        System.out.println(linkedList.toString());
    }
}
