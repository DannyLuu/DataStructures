package com.datastructures.lists;

import java.util.Objects;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node() {
        data = null;
        next = null;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof  Node)) {
            return false;
        }

        Node node = (Node) obj;

        return Objects.equals(data, ((Node) obj).data) && Objects.equals(next, ((Node) obj).next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}
