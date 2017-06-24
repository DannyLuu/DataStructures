package com.lists;

/**
 * Singly Linked List class.
 */
public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    /**
     * Add node at head.
     */
    public void add(T data) {
        Node<T> node = new Node(data);
        node.setNext(head);
        head = node;
        size++;
    }

    /**
     * Add node at index.
     *
     * @param data
     * @param index
     */
    public void add(T data, int index) {
        // Add at the beginning.
        if (index == 0) {
            add(data);
            return;
        }

        Node currNode = head;
        Node newNode = new Node(data);

        while (index - 1 > 0) {
            currNode = currNode.getNext();
            index--;
        }

        newNode.setNext(currNode.getNext());
        currNode.setNext(newNode);
        size++;
    }

    /**
     * Get node at index.
     *
     * @param index
     * @return
     */
    public Node get(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }

        Node currNode = head;
        while (index > 0) {
            currNode = currNode.getNext();
            index--;
        }

        return currNode;
    }

    /**
     * Remove node at index.
     *
     * @param index
     */
    public void remove(int index) {
        Node prev = null;
        Node curr = head;

        while (index > 0) {
            prev = curr;
            curr = curr.getNext();
            index--;
        }

        if(curr == head) {
            head = curr.getNext();
            curr.setNext(null);
            size--;
        } else {
            prev.setNext(curr.getNext());
            curr.setNext(null);
            size--;
        }
    }

    @Override
    public String toString() {
        String msg = "";
        Node curr = head;
        while (curr != null) {
            if (curr != null) {
                msg += curr.getData().toString() + ", ";
                curr = curr.getNext();
            }
        }
        return msg;
    }
}
