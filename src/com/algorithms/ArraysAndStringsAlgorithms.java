package com.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Hisoka on 2017-07-07.
 */
public class ArraysAndStringsAlgorithms {

    /**
     * Is Unique: Implement an algorithm to determine if a string has all unique characters.
     * <p>
     * What if you cannot use additional data structures?
     *
     * @param word - the string to test.
     * @return
     */
    public boolean isUnique(String word) {
        String currentWord = word;
        while (currentWord.length() > 0) {
            String[] split = currentWord.split("" + currentWord.charAt(0));

            if ((split.length > 2) || (split.length == 2 && split[1].length() < currentWord.length() - 1)) {
                return false;
            }

            if (split.length == 2) {
                currentWord = split[1];
            } else if (split.length == 0 && currentWord.length() == 1) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }


    /**
     * Given two strings, write a method to decide if one is a permutation of the other.
     *
     * @param permutation - potential permutation in word.
     * @param word        - String being checked.
     * @return
     */
    public boolean checkPermutation(String permutation, String word) {
        return false;
    }

    /**
     * Generate all of the permutations for the given string.
     *
     * @param input
     * @return all permutations
     */
    public Set<String> generatePermutations(String input) {
        Set<String> permutations = new HashSet<>();

        if (input.length() == 1) {
            permutations.add(input);
        } else {
            String permutation = input;
            for (int i = 0; i < input.length(); i++) {
                permutation = rotate(permutation);

                Set<String> subPerm = generatePermutations(permutation.substring(1, permutation.length()));
                for (String p : subPerm) {
                    permutations.add(permutation.charAt(0) + p);
                }
            }
        }

        return permutations;
    }

    private String rotate(String input) {
        if (input.length() <= 1) {
            return input;
        } else {
            return input.substring(1, input.length()) + input.charAt(0);
        }
    }
}
