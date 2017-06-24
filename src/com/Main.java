package com;

import com.lists.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();

        System.out.println("Is new linked list empty? " + linkedList.isEmpty());

        linkedList.add("d");
        linkedList.add("c");
        linkedList.add("b");
        linkedList.add("a");

        System.out.println(linkedList.getSize() + " - LinkedList: " + linkedList.toString());

        linkedList.add("0", 0);
        System.out.println(linkedList.getSize() + " - Insert 0 at beginning: " + linkedList.toString());

        linkedList.add("yolo", linkedList.getSize() - 1);
        System.out.println(linkedList.getSize() + " - Insert yolo at the end: " + linkedList.toString());

        linkedList.add("swag", 2);
        System.out.println(linkedList.getSize() + " - Insert swag at the 2nd position: " + linkedList.toString());

        System.out.println("Get node at position 0: " + linkedList.get(0));
        System.out.println("Get node at position 100: " + linkedList.get(100));

        linkedList.remove(0);
        System.out.println(linkedList.getSize() + " - Remove first element: " + linkedList.toString());

        linkedList.remove(3);
        System.out.println(linkedList.getSize() + " - Remove swag from the list: " + linkedList.toString());

        linkedList.remove(linkedList.getSize() - 1);
        System.out.println(linkedList.getSize() + " - Remove the last element from the list: " + linkedList.toString());
    }
}
