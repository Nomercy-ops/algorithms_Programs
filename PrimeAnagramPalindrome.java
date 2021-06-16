/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 
 * Purpose : is to find and print prime anagram and prime palindrome array.
 * if string is matched us binary search method.
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

import com.bridgelabz.Algorithm.HelperFiles.Utility;

public class PrimeAnagramPalindrome {

    /**
     *  This is the main method for finding and printing prime anagram palindrome class.
     *  Utility class is used as a helper for finding prime anagram and prime palindrome. 
     * @param args 
     */
    
    public static void main(String[] args) {
 
        //prime numbers array between 0 and 1000
        String[] primeNumbers = Utility.primeNumber(1000);

        System.out.println("Anagram and prime numbers are: ");
        // prints prime numbers that are anagrams
        for (int i = 0; i < primeNumbers.length; i++) {
            for (int j = i + 1; j < primeNumbers.length; j++) {
                if (Utility.findAnagram(primeNumbers[i], primeNumbers[j])) { // it will call method in utility class.
                    System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
                }
            }
        }
        // prints prime number that are palindrome
        System.out.println("\nPalindrome and prime numbers are: ");
        // prints prime numbers that are palindrome
        for (String primeNumber : primeNumbers) {
            if (Utility.palindrome(primeNumber)) {
                System.out.println(primeNumber);
            }
        }

    }

}
