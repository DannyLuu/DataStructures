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

        String word = "abcabc";
        Set<String> permuations = arraysAndStringsAlgorithms.generatePermutations(word);

        for (String s : permuations)
            System.out.println(s);

        System.out.println("permutation size = " + permuations.size());
    }
}
