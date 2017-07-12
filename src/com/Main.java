package com;

import com.algorithms.ArraysAndStringsAlgorithms;

public class Main {

    public static void main(String[] args) {
        ArraysAndStringsAlgorithms arraysAndStringsAlgorithms = new ArraysAndStringsAlgorithms();

        char[][] matrix = new char[][]{
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        char[][] oddMatrix = new char[][]{
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        int[][] test = new int[][]{
                {0, 2, 3, 4, 5, 6, 7, 8, 9},
                {7, 2, 3, 4, 5, 6, 7, 4, 5},
                {1, 3, 4, 5, 0, 7, 8, 3, 2},
                {1, 2, 3, 4, 5, 4, 3, 2, 1},
                {1, 3, 4, 3, 2, 1, 4, 2, 0}
        };

        arraysAndStringsAlgorithms.zeroMatrix(test);
        System.out.println(arraysAndStringsAlgorithms.printMatrix(test));
    }
}
