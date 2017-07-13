package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.lists.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(9);
        linkedList.add(2);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(14);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(7);
        linkedList.add(6);

        // Return the kth to last element where k = 5
        // Should return 4, 3, 11, 10, 2, 9, 3, 2, 1
        linkedListAlgorithms.getKthToLast(5, linkedList);
        System.out.println(linkedList.toString());

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);
        linkedList2.add(9);
        linkedList2.add(2);
        linkedList2.add(10);
        linkedList2.add(11);
        linkedList2.add(3);
        linkedList2.add(4);
        linkedList2.add(14);
        linkedList2.add(8);
        linkedList2.add(9);
        linkedList2.add(7);
        linkedList2.add(6);

        // Remove those damn duplicates!
        // Should return a list with 6, 7, 9, 8, 14, 4, 3, 11, 10, 2, 1
        linkedListAlgorithms.removeDuplicates(linkedList2);
        System.out.println(linkedList2.toString());
        System.out.println("Size = " + linkedList2.getSize());
    }
}
