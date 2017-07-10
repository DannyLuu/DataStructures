package com;

import com.algorithms.ArraysAndStringsAlgorithms;

public class Main {

    public static void main(String[] args) {
        ArraysAndStringsAlgorithms arraysAndStringsAlgorithms = new ArraysAndStringsAlgorithms();
        
        System.out.println("T - pale, ple -> " + arraysAndStringsAlgorithms.oneAway("pale", "ple"));
        System.out.println("T - pales, pale -> " + arraysAndStringsAlgorithms.oneAway("pales", "pale"));
        System.out.println("T - pale, bale -> " + arraysAndStringsAlgorithms.oneAway("pale", "bale"));
        System.out.println("F - pale, bake -> " + arraysAndStringsAlgorithms.oneAway("pale", "bake"));
        System.out.println("T - small, mall -> " + arraysAndStringsAlgorithms.oneAway("small", "small"));

    }
}
