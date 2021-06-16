/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 
 * Purpose : is to find the anagram by comparing two userinput strings.
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

// importing helper files from utility class
import com.bridgelabz.Algorithm.HelperFiles.Utility;


public class AnagramDetection {
    
    /**
     * This is the main method for anagram Detection.
     * Here two user input strings are compared using find anagram method and,
     * also print the output if it is anagram or not.
     * Utility class find anagram method is called here for finding anagram. 
     * @param args 
     */
    
    public static void main(String[] args) {

        System.out.println("Enter string1 and string2 to check for anagram: ");

        String string1 = Utility.scanner.next(); //first string
        String string2 = Utility.scanner.next(); //second string
        
        // checking anagram or not by calling anagram method from utility class. 
        if (Utility.findAnagram(string1, string2)) {
            System.out.println("Strings are anagram.");
        } else {
            System.out.println("Strings are not anagram.");
        }
        Utility.scanner.close();
    }
    

}
