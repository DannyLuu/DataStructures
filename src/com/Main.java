package com;

import com.algorithms.ArraysAndStringsAlgorithms;
import com.datastructures.trees.BinarySearchTree;
import com.datastructures.trees.BinarySearchTree.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArraysAndStringsAlgorithms arraysAndStringsAlgorithms = new ArraysAndStringsAlgorithms();

        String first = "123456";
        String second = "654123";

        System.out.println("checkPermutation = " + arraysAndStringsAlgorithms.checkPermutation(first,second));

        String url = "Mr John Smith ";
        System.out.println(arraysAndStringsAlgorithms.URLify(url));
    }
}
