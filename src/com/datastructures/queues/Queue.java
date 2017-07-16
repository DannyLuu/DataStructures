package com.datastructures.queues;

import java.util.NoSuchElementException;

/**
 * Created by Hisoka on 2017-07-15.
 */
public class Queue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    /**
     * Add item to the end of the list.
     * @param item
     */
    public void add(T item) {
        QueueNode<T> queueNode = new QueueNode<T>(item);

        if (isEmpty()) {
            first = queueNode;
            last = queueNode;
        } else {
            last.next = queueNode;
            last = queueNode;
        }
    }

    /**
     * Remove the first item in the list.
     * @return
     */
    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        T data = first.data;
        first = first.next;

        if (isEmpty()) {
            last = null;
        }
        return data;
    }

    /**
     * Return the top of the queue.
     * @return
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    /**
     * Returns true if and only if the queue is not empty.
     * @return
     */
    public boolean isEmpty() {
       return first == null;
    }
}
