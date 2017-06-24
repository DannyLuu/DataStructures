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

				linkedList.add("yolo", linkedList.getSize());
				System.out.println(linkedList.getSize() + " - Insert yolo at the end: " + linkedList.toString());

				linkedList.add("swag", 4);
				System.out.println(linkedList.getSize() + " - Insert swag at the 4th position: " + linkedList.toString());

		}
}
