package com;

import com.trees.BinarySearchTree;
import com.trees.BinarySearchTree.Node;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(7);
        bst.insert(6);
        bst.insert(11);
        bst.insert(13);
        Node root = bst.getRoot();
        System.out.println(" 0 - left, root, right = " + root.left + "," + root + "," + root.right);

        Node left = root.left;
        System.out.println(" 1 - left, root, right = " + left.left + "," + left + "," + left.right);

        Node right = root.right;
        System.out.println(" 1 - left, root, right = " + right.left + "," + right + "," + right.right);


        Node leftRight = left.right;
        System.out.println(" 2 - left, root, right = " + leftRight.left + "," + leftRight + "," + leftRight.right);

        Node rightLeft = right.left;
        System.out.println(" 2 - left, root, right = " + rightLeft.left + "," + rightLeft + "," + rightLeft.right);

        System.out.println("parent of 11 should be 15 = " + rightLeft.parent);
        System.out.println("parent of 5 should be 10 = " + left.parent);
        System.out.println("parent of 15 should be 10 = " + right.parent);
        System.out.println("parent of root should be null = " + root.parent);


        System.out.println("Find 13 = " + bst.search(13));

    }
}
