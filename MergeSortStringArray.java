/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 
 * Purpose :is to sort the strings using merge sort and print the sorted list.
 * if string is matched us binary search method.
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

// importing all method from Utility class.
import com.bridgelabz.Algorithm.HelperFiles.Utility;

public class MergeSortStringArray {
    
    /**
     *  This is the main method for merge sort string array.
     *  To perform merge store it takes input of strings from the user and stored it in array.
     *  Utility class merge sort method is called for performing merge sort operations.
     * @param args  
     */

    public static void main(String[] args) {

        System.out.print("Enter number of strings: ");
        //strings count
        int numberOfStrings = Utility.scanner.nextInt();	
        //strings array to store strings entered by user
        String[] strings = new String[numberOfStrings];

        // filling array from user input
        for (int i = 0; i < numberOfStrings; i++) {
            strings[i] = Utility.scanner.next();
        }
        Utility.scanner.close(); // closing scanner
         
        // storing the sorted list in string list
       String [] stringList = Utility.mergeSort(strings);	

          //prints sorted array
        System.out.println("Sorted list:");
        for (String string : stringList) {
            System.out.println(string);
        }
    }

}
