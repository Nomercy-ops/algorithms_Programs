/**
 * *******************************************************************************************************
 * @author Rikesh Chhetri
 * @version 1.0
 * @Purpose : To print all permutations of a String and to check arrays returned
 * by two string functions are equal.
 * @Created_on: 15.06.21
 * ********************************************************************************************************
 */

package com.bridgelabz.Algorithm;

import java.util.*;

 class PermutationOfString {

    static ArrayList<String> arrayl = new ArrayList<>();
    static ArrayList<String> array2 = new ArrayList<String>();

    /**
     * Method to swap a string value.
     *
     * @param a String
     * @param i index of string
     * @param j index of string
     * @return swapped string value
     */
    
    private static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    /**
     * Method to generate permutations using the recursion
     * and the string generated from it is stored into array1.
     * 
     * @param string
     * @param start
     * @param end
     */
    
    private static void generatePermutation(String string, int start, int end) {
        // Prints the permutations
        if (start == end - 1) {
            arrayl.add(string);
        } else {
            for (int i = start; i < end; i++) {
                // Swapping the string by fixing a character
                string = swapString(string, start, i);
                // Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(string, start + 1, end);
                // Backtracking and swapping the characters again.
                string = swapString(string, start, i);
            }
        }
    }

    /**
     * method to generate permutations using iterative method
     * and that string is stored into array2.
     * @param string
     */
    
    private static void permutations(String string) {

        array2.add(String.valueOf(string.charAt(0)));

        for (int i = 1; i < string.length(); i++) {

            for (int j = array2.size() - 1; j >= 0; j--) {
                String string2 = array2.remove(j);

                for (int k = 0; k <= string2.length(); k++) {
                    array2.add(string2.substring(0, k) + string.charAt(i) + string2.substring(k));
                }
            }
        }

    }

    /**
     * This is the main method for permutation. From here we get a user input of
     * string  and then call the generate permutation functions for generating recursion permutation
     * after that permutations method is called for getting iterative method permutation.
     *
     * @param args
     */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a String : ");
            String name = scanner.nextLine();
            scanner.close();
            generatePermutation(name, 0, name.length());
            permutations(name);
            
            //sorting the 
            Collections.sort(array2);
            Collections.sort(arrayl);
            int i = 0;
            for (; i < array2.size(); i++) {
                System.out.println(array2.get(i) + " " + arrayl.get(i));
            }

            if (array2.equals(arrayl)) {
                System.out.println("Both are same " + " and the number of permutations are " + i);
            } else {
                System.out.println("wrong");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
