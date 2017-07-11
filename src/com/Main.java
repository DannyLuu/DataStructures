package com;

import com.algorithms.ArraysAndStringsAlgorithms;

public class Main {

    public static void main(String[] args) {
        ArraysAndStringsAlgorithms arraysAndStringsAlgorithms = new ArraysAndStringsAlgorithms();

        char[][] matrix = new char[][] {
            {'a', 'b', 'c', 'd'},
            {'e', 'f', 'g', 'h'},
            {'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p'}
        };

        char[][] oddMatrix = new char[][] {
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'}
        };

        arraysAndStringsAlgorithms.rotateMatrix(3, oddMatrix);

    }
}
