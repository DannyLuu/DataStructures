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
     * Insert nodes with a unique value  into the BST.
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


    /**
     * Remove the node with the value.
     * @param node
     */
    public void remove(int value) {
        Node nodeToRemove = search(value);

        if (nodeToRemove != null) {
            // Remove leaf node.
            if (nodeToRemove.isLeafNode()) {
                Node parent = nodeToRemove.parent;
                if (parent.left == nodeToRemove) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                nodeToRemove = null;

            // Remove node with one child - LEFT
            } else if (nodeToRemove.right == null) {
                Node successorNode = nodeToRemove.left;
                Node parent = nodeToRemove.parent;

                if (parent.left == nodeToRemove) {
                    parent.left = successorNode;
                } else {
                    parent.right = successorNode;
                }

                successorNode.parent = parent;
                nodeToRemove.parent = null;
            // Remove node with one child - right
            } else if (nodeToRemove.left == null) {
                Node successorNode = nodeToRemove.right;
                Node parent = nodeToRemove.parent;

                if (parent.left == nodeToRemove) {
                    parent.left = successorNode;
                } else {
                    parent.right = successorNode;
                }

                successorNode.parent = parent;
                nodeToRemove.parent = null;
            // Remove node with two children.
            } else {
                System.out.println("Removing node with two children.");
                Node successorNode = nodeToRemove.right;
                boolean smallestNodeFound = false;
                while (!smallestNodeFound) {
                    if (successorNode.left != null) {
                        successorNode = successorNode.left;
                    } else {
                        smallestNodeFound = true;
                    }
                }

                successorNode.parent.left = null;
                successorNode.parent = nodeToRemove.parent;
                successorNode.right = nodeToRemove.right;
                successorNode.left = nodeToRemove.left;
                nodeToRemove = null;
            }
        }
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
