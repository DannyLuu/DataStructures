package com;

import com.datastructures.trees.BinarySearchTree;
import com.datastructures.trees.BinaryTreeTraversal;

public class Main {

    public static void main(String[] args) {
        BinaryTreeTraversal bstTraversal = new BinaryTreeTraversal();
        BinarySearchTree bst = generateBST();


        System.out.println("In Order Traversal...");
        bstTraversal.inOrderTraversal(bst.getRoot());

        System.out.println("\nPre Order Traversal...");
        bstTraversal.preOrderTraversal(bst.getRoot());

        System.out.println("\nPost Order Traversal...");
        bstTraversal.postOrderTraversal(bst.getRoot());

    }

    public static BinarySearchTree generateBST() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(25);
        bst.insert(15);
        bst.insert(50);
        bst.insert(10);
        bst.insert(22);
        bst.insert(35);
        bst.insert(70);
        bst.insert(4);
        bst.insert(12);
        bst.insert(18);
        bst.insert(24);
        bst.insert(31);
        bst.insert(44);
        bst.insert(66);
        bst.insert(90);

        return bst;
    }

}
