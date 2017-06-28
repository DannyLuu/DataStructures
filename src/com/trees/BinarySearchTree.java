package com.trees;

/**
 * Created by Hisoka on 2017-06-25.
 */
public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    /**
     * Insert values into the BST.
     *
     * @param value
     */
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertNode(root, value);
        }
    }

    public void remove(Node node) {

    }

    /**
     * Search should use in order traversal to find the value. Return null otherwise.
     * @param value
     * @return
     */
    public Node search(int value) {
        return binarySearch(root, value);
    }

    private Node insertNode(Node node, int value) {
        if (node == null) {
            node = new Node(value);
        } else if (value < node.data) {
            node.left = insertNode(node.left, value);
            node.left.parent = node;
        } else {
            node.right = insertNode(node.right, value);
            node.right.parent = node;
        }
        return node;
    }

    private Node binarySearch(Node node, int value) {
        if (node == null) {
            return null;
        } else if (node.data == value) {
            return node;
        } else if (value < node.data) {
            return binarySearch(node.left, value);
        } else {
            return binarySearch(node.right, value);
        }
    }

    public Node getRoot() {
        return root;
    }

    public class Node {
        public int data;
        public Node parent;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        public boolean isLeafNode() {
            return left == null && right == null;
        }

        public String toString() {
            if (this == null) {
                return "null";
            } else {
                return "" + data;
            }
        }
    }

}
