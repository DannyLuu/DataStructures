package com.datastructures.trees;

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
     *
     * @param
     */
    public void remove(int value) {
        Node nodeToRemove = search(value);

        if (nodeToRemove != null) {
            // Remove leaf node.
            if (nodeToRemove.isLeafNode()) {
                Node parent = nodeToRemove.parent;
                if (parent.determineRelationTo(nodeToRemove) == RELATION.LEFT_CHILD) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                nodeToRemove.parent = null;

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

                // TODO: Add a switch statement here.
                if (parent.left == nodeToRemove) {
                    parent.left = successorNode;
                } else {
                    parent.right = successorNode;
                }

                successorNode.parent = parent;
                nodeToRemove.parent = null;
                // Remove node with two children.
            } else {
                // Find the successor node.
                Node successorNode = nodeToRemove.right;
                while (successorNode.left != null) {
                    successorNode = successorNode.left;
                }

                if (successorNode.right != null) {
                    successorNode.right.parent = successorNode.parent;
                    if (successorNode.parent.determineRelationTo(successorNode) == RELATION.LEFT_CHILD) {
                        successorNode.parent.left = successorNode.right;
                    } else {
                        successorNode.parent.right = successorNode.right;
                    }
                } else if (successorNode.left != null) {
                    successorNode.left.parent = successorNode.parent;
                    if (successorNode.parent.determineRelationTo(successorNode) == RELATION.LEFT_CHILD) {
                        successorNode.parent.left = successorNode.left;
                    } else {
                        successorNode.parent.right = successorNode.left;
                    }
                } else {
                    if (successorNode.parent.determineRelationTo(successorNode) == RELATION.LEFT_CHILD) {
                        successorNode.parent.left = null;
                    } else {
                        successorNode.parent.right = null;
                    }
                }

                if (nodeToRemove == root) {
                    root = successorNode;
                } else {
                    if (nodeToRemove.parent.determineRelationTo(nodeToRemove) == RELATION.LEFT_CHILD) {
                        nodeToRemove.parent.left = successorNode;
                    } else {
                        nodeToRemove.parent.right = successorNode;
                    }
                }

                successorNode.parent = nodeToRemove.parent;
                successorNode.left = nodeToRemove.left;
                successorNode.left.parent = successorNode;
                successorNode.right = nodeToRemove.right;
                successorNode.right.parent = successorNode;

            }
        }
    }

    /**
     * Search should use in order traversal to find the value. Return null otherwise.
     *
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

        public RELATION determineRelationTo(Node potentialFamily) {
            if (this.parent == potentialFamily) {
                return RELATION.PARENT;
            } else if (this.left == potentialFamily) {
                return RELATION.LEFT_CHILD;
            } else if (this.right == potentialFamily) {
                return RELATION.RIGHT_CHILD;
            } else {
                return RELATION.UNKNOWN;
            }
        }
    }

    public static enum RELATION {
        PARENT,
        LEFT_CHILD,
        RIGHT_CHILD,
        UNKNOWN; // I don't know what else to call it :S
    }

}
