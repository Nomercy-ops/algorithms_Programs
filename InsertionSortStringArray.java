/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 Purpose : Use Insertion Sort to sort the words in the String
 * array. and print the Sorted List.
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


public class InsertionSortStringArray {

    /**
     * This is the Main method of the Insertion Sort String Array. From here
     * using File reader we read our word list file and then buffer reader take
     * that file and do split the words with comma and stored it to strings
     * array. After that we do insertion sort to sort it and sorted list are
     * stored on word list and print them. Used Utility class for sorting of the
     * strings array.
     *
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
       // string array to store file words into strings
        String[] strings = null;
        // reading file
        FileReader file = new FileReader("WordList.txt");
       
        try (BufferedReader bufferedReader = new BufferedReader(file)) {
            // splitting words  with comma
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");	//	splits words by commas
            }
        }
        // storing sorted string into wordlist array.
        String[] wordList = Utility.insertionSortAscending(strings);
        
        // printing the sorted list.
        System.out.println("The sorted Word List are : ");
        for (String element : wordList) {
            System.out.println(element);
        }

    }
}
