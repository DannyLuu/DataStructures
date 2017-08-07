package com.datastructures.trees;

import com.datastructures.trees.BinarySearchTree.Node;

/**
 * Tree Traversals
 * <p>
 * In computer science, tree traversal (also known as tree search) is a form of graph traversal and refers to the
 * process of visiting (checking and/or updating) each node in a tree data structure, exactly once.
 */
public class BinaryTreeTraversal {

    /**
     * In-order traversal means to "visit" (often, print) the left branch, then the current node, and finally, the
     * right branch.
     * <p>
     * hen performed on a binary search tree, it visits the nodes in ascending order (hence the name "in-order").
     */
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    /**
     * Pre-order traversal visits the current node before its child nodes (hence the name "pre-order").
     * <p>
     * In a pre-order traversal, the root is always the first node visited.
     */
    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    /**
     * Post-order traversal visits the current node after its child nodes (hence the name "post-order").
     * <p>
     * In a post-order traversal, the root is always the last node visited.
     */
    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}
