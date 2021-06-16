/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 
 * Purpose :Program to find and  print prime number array between 0 to 1000.
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

// importing  all methods from utility class
import com.bridgelabz.Algorithm.HelperFiles.Utility;

public class PrimeNumbers {

    /**
     *  This is the main method for for finding and printing prime number of array.
     *  Utility file is created for performing prime number of array.
     * @param args 
     */
    
    public static void main(String[] args) {

        //Storing prime number into integer array by calling prime number method of utility class.
        String[] integerArray = Utility.primeNumber(1000);
        //printing the array
        for (String string : integerArray) {
            System.out.println(string);
        }
    }

}
