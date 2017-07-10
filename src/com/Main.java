package com;

import com.algorithms.ArraysAndStringsAlgorithms;

public class Main {

    public static void main(String[] args) {
        ArraysAndStringsAlgorithms arraysAndStringsAlgorithms = new ArraysAndStringsAlgorithms();

        System.out.println("Compressing \"aabcccccaaa\" -> " + arraysAndStringsAlgorithms.compressString("aabcccccaaa"));
        System.out.println("Compressing \"abcd\" -> " + arraysAndStringsAlgorithms.compressString("abcd"));
        System.out.println("Compressing \"a\" -> " + arraysAndStringsAlgorithms.compressString("a"));
        System.out.println("Compressing \"aabb\" -> " + arraysAndStringsAlgorithms.compressString("aabb"));
    }
}
