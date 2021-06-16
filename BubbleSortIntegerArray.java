/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 Purpose : is to get a number from user and store it into array
 * and perform bubble sort and print the sorted number.
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

// importing all method from Utility class.
import com.bridgelabz.Algorithm.HelperFiles.Utility;

public class BubbleSortIntegerArray {

    /**
     *  This is the main method for Bubble sort on int array.
     * To perform bubble sort here user will puts desired numbers into array and,
     * Utility class is used her for performing bubble sort here.
     * finally sorted list of number is printed from here.
     * @param args 
     */
    
    public static void main(String[] args) {

        System.out.println("Enter number of integers to sort: ");
        int count = Utility.scanner.nextInt();
        int[] array = new int[count];	//array to store integers

        //fills the array asking user input
        System.out.println("Enter integers to sort: ");
        for (int i = 0; i < count; i++) {
            array[i] = Utility.scanner.nextInt();
        }
        //sorts the array
        int[] sortedArray = Utility.bubbleSortAscending(array);

        //prints the arrayof numbers
        System.out.println("The sorted Numbers are : ");
        for (int element : sortedArray) {
            System.out.println(element);
        }

        Utility.scanner.close();
    }

}
