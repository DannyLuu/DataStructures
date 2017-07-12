package com;

import com.algorithms.ArraysAndStringsAlgorithms;

public class Main {

    public static void main(String[] args) {
        ArraysAndStringsAlgorithms arraysAndStringsAlgorithms = new ArraysAndStringsAlgorithms();

        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        System.out.println("is rotation? " + arraysAndStringsAlgorithms.isRotation(s1,s2));
    }
}
