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

		public void add(T data, int index) {
				int pos = index - 1;

				if (pos == 0) {
						add(data);
						return;
				}

				Node<T> node = new Node(data);
				Node ptr = head;

				if (pos < size) {
					for (int i = 1; i < size; i++) {

							if (i == pos) {
									node.setNext(ptr.getNext());
									ptr.setNext(node);
									break;
							}
							ptr = ptr.getNext();
					}
						size++;
				}

		}

		/**
		 * Get node at index.
		 * @param index
		 * @return
		 */
		public Node get(int index) {
				if (index < 0) {
						return null;
				}

				return null;
		}

		/**
		 * Remove node at index.
		 * @param index
		 * @return
		 */
		public boolean remove(int index) {
				return false;
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
