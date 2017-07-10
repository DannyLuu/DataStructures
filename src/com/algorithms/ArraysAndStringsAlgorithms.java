package com.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Interview Questions
 * Chapter 1 - Arrays and Strings
 */
public class ArraysAndStringsAlgorithms {

    /**
     * <b>1.1</b><br/>
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
     * <b>1.2</b><br/>
     * Given two strings, write a method to decide if one is a permutation of the other.
     *
     * @param first  - potential permutation in word.
     * @param second - String being checked.
     * @return
     */
    public boolean checkPermutation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        char[] firstChars = first.toCharArray();
        for (char c : firstChars) {
            if (!second.contains(c + "")) {
                return false;
            }
        }

        Set<String> permutations = generatePermutations(first);

        return permutations.contains(second);
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


    /**
     * <b>1.3</b><br/>
     * URLify: Write a method to replace all spaces in a string with '%20:
     * You may assume that the string has sufficient space at the end to hold the additional characters,
     * and that you are given the "true" length of the string. (Note: If implementing in Java, please
     * use a character array so that you can perform this operation in place.)
     * <p>
     * EXAMPLE
     * <br/>
     * Input: "Mr John Smith    " 13
     * <br/>
     * Output: "Mr%20John%20Smith"
     * </p>
     *
     * @param input
     * @return
     */
    public String URLify(String input) {
        char[] url = new char[input.length() * 2];
        int additionalNumOfSpace = 0;
        int offset = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == ' ') {
                url[offset++] = '%';
                url[offset++] = '2';
                url[offset++] = '0';
                additionalNumOfSpace++;
            } else {
                url[offset++] = c;
                additionalNumOfSpace = 0;
            }
        }
        return String.copyValueOf(url, 0, offset - (additionalNumOfSpace * 3));
    }

    /**
     * <b>1.4</b><br/>
     * <b></b>Palindrome Permutation:</b> Given a string, write a function to check if it is a permutation of a palin- drome.
     * A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement
     * of letters.The palindrome does not need to be limited to just dictionary words.
     * <p>
     * EXAMPLE
     * <br/>
     * Input: Tact Coa
     * <br/>
     * Output: True (permutations: "taco cat". "atco cta". etc.)
     * </p>
     *
     * @param input
     * @return
     */
    public Set<String> getPalindromePermutations(String input) {
        Set<String> palindromePermutation = new HashSet<>();

        if (isPalindromePermutation(input)) {
            char[] text = input.toLowerCase().toCharArray();
            int[] alphabet = new int[256];
            int oddChar = -1;
            int wildCard = -1;

            for (int i = 0; i < input.length(); i++) {
                if (text[i] == ' ') {
                    wildCard = i;
                } else {
                    alphabet[text[i]]++;
                }
            }

            String halfPalindrome = "";
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == 1 && alphabet[i] != ' ') {
                    oddChar = i;
                } else {
                    for (int j = 0; j < alphabet[i] / 2; j++)
                        halfPalindrome = halfPalindrome.concat((char) i + "");
                }
            }

            Set<String> mirroredPermuations = generatePermutations(halfPalindrome);
            for (String permuation : mirroredPermuations) {
                if (oddChar > 0) {
                    palindromePermutation.add(permuation + (char) oddChar + mirror(permuation));
                } else {
                    palindromePermutation.add(permuation + mirror(permuation));
                }
            }

            if (wildCard > 0) {
                Set<String> mirroredPermutationsWithWildcard = new HashSet<>();
                for (String permutation : palindromePermutation) {
                    for (int i = 1; i < permutation.length() - 1; i++) {
                        mirroredPermutationsWithWildcard.add(permutation.substring(0, i) + " " + permutation.substring(i, permutation.length()));
                    }
                }

                palindromePermutation = mirroredPermutationsWithWildcard;
            }

        }

        return palindromePermutation;
    }

    /**
     * Check if a string is a palindrome permutation.
     *
     * @param input
     * @return
     */
    public boolean isPalindromePermutation(String input) {
        char[] text = input.toLowerCase().toCharArray();
        int[] alphabet = new int[256];
        int oddCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (text[i] != ' ') {
                alphabet[text[i]]++;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                if (alphabet[i] % 2 != 0) {
                    oddCount++;
                }
            }
        }

        if (oddCount > 1) {
            return false;
        }

        return true;
    }

    /**
     * Mirrors the given input.
     * <p>
     * Ex. asdf -> fdsa
     * </p>
     *
     * @param input
     * @return
     */
    public String mirror(String input) {
        String mirrored = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            mirrored = mirrored + input.charAt(i);
        }

        return mirrored;
    }

    /**
     * One Away: There are three types of edits that can be performed on strings:
     * insert a character, remove a character, or replace a character. Given two
     * strings, write a function to check if they are one edit (or zero edits) away.
     * <p>
     * EXAMPLE
     * <br/>
     * pale, ple -> true
     * <br/>
     * pales, pale -> true
     * <br/>
     * pale, bale -> true
     * <br/>
     * pale, bake -> false
     * <br/>
     * small, mall -> true
     * </p>
     *
     * @param first
     * @param second
     * @return
     */
    public boolean oneAway(String first, String second) {
        char[] firstChars = first.toLowerCase().toCharArray();
        char[] secondChars = second.toLowerCase().toCharArray();

        if (first.equals(second)) {
            return true;
        } else if ((first.length() > second.length() && first.length() - second.length() > 1) || (first.length() < second.length() && second.length() - first.length() > 1)) {
            return false;
        }

        int oddChars = 0;
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length() - 1; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    oddChars++;
                }

                if (oddChars > 1) {
                    return false;
                }
            }
        }

        int currPos = 0;
        if (second.length() + 1 == first.length()) {
            firstChars = secondChars;
            secondChars = first.toLowerCase().toCharArray();
        }

        if (first.length() + 1 == second.length()) {
            for (int i = 0; i < second.length(); i++) {
                if (secondChars[i] != firstChars[currPos]) {
                    oddChars++;
                }

                if (oddChars > 1) {
                    return false;
                }

                if (currPos < firstChars.length - 1) {
                    currPos++;
                }
            }
        }

        return true;
    }

}
