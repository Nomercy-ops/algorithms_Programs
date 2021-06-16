/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 
 * Purpose :Program to search word from file word list and print
 * if string is matched us binary search method.
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

import java.io.FileReader;
import java.io.IOException;

// importing helper files from utility class
import com.bridgelabz.Algorithm.HelperFiles.Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class BinarySearchStringArray {
    
    /**
     * This is the Main method of the Binary Search String Array.From here using File reader we read our word list file and then buffer reader take
     * that file and do split the words with comma and stored it to strings array.
     * After that we do insertion sort to sort it and sorted list are stored on word list and do binary search .
     * Used Utility class for sorting of the strings array and binary search.
     * @param args
     * @throws FileNotFoundException
     * @throws IOException 
     */

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String[] strings = null;	//	string array to store file words into strings

        FileReader file = new FileReader("WordList.txt");
        try (BufferedReader bufferedReader = new BufferedReader(file)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");	//	splits words by commas
            }
        }
            // storing sorted string into wordlist array.
        String[] wordList = Utility.insertionSortAscending(strings); 
        System.out.println("Enter a word to search: ");
        String search = Utility.scanner.next();	//	word to be searched

        if (Utility.binarySearch(search, wordList) != -1) {	//	word found
            System.out.println("Word found");
        } else {	//	word not found
            System.out.println("Word not found");
        }

    }
}
