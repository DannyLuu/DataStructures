package com.algorithms;

import com.datastructures.lists.LinkedList;
import com.datastructures.lists.Node;

/**
 * Created by Hisoka on 2017-07-12.
 */
public class LinkedListAlgorithms {

    /**
     * <b>2.1</b><br/>
     * Remove Duplicates
     * <br/>
     * Write code to remove duplicates from an unsorted linked list.
     * <p>
     * <br/>
     * <p>
     * Follow up:<br/>
     * How would you solve this problem if a temporary buffer is not allowed?
     * </p>
     *
     * @param linkedList
     */
    public void removeDuplicates(LinkedList linkedList) {

        if (linkedList == null && linkedList.getSize() <= 1) {
            return;
        }

        int position = 1;
        Node currNode = linkedList.get(0);
        while (currNode != null) {
            Node traversalNode = currNode.getNext();
            int counter = position;
            while (traversalNode != null) {
                if (traversalNode.getData() == currNode.getData()) {
                    traversalNode = traversalNode.getNext();
                    linkedList.remove(counter);
                } else {
                    traversalNode = traversalNode.getNext();
                    counter++;
                }
            }

            currNode = currNode.getNext();
            position++;
        }
    }

    /**
     * <b>2.2</b><br/>
     * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
     *
     * @param linkedList
     * @return
     */
    public void getKthToLast(int k, LinkedList<Integer> linkedList) {
        LinkedList<Integer> lastElements = new LinkedList<>();

        Node currNode = linkedList.getHead();
        while (currNode != null && k > 0) {
            currNode = currNode.getNext();
            k--;
        }

        linkedList.setHead(currNode);
    }
}
