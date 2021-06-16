/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 
 * Purpose : is that user will make a guess of a number and using binary search have to find that number.
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

// importing Utility file for calling methods.
import com.bridgelabz.Algorithm.HelperFiles.Utility;

public class GuessAndFindNumber {

    //array of numbers of given range
    int[] numberArray;
    int count = 0;
    // the number in mind
    int numberInMind;	
    int range;
   //number of times question will be asked
    double maxCount = 0;	

    public static void main(String[] args) {

        GuessAndFindNumber findYourNumber = new GuessAndFindNumber();
        findYourNumber.start();
    }

    /**
     *  Asking user for range of maximum number
     */
    
    private void start() {

        System.out.print("Enter limit of Number : ");
        range = Utility.scanner.nextInt();
        
        // array initialisation
        numberArray = new int[range];	
        //fills the array 
        for (int i = 0; i < range; i++) {
            numberArray[i] = i;
        }

        //calculates maximum count of questions
        maxCount = (Math.log(range) / Math.log(2));
        System.out.println("Number of Tries required to guess: " + ((int) maxCount + 1));
        binarySearch(0, range - 1);
    }

    /**
     * @param first - first element in range
     * @param last - last element in the range asks user if the number is in
     * given range and reduces the range
     */
    
    private void binarySearch(int first, int last) {
        if (count < maxCount) {
            int middle = (first + last) / 2;
            count++;
            System.out.println("Is number between " + first + " and " + middle + "?");
            String temp = Utility.scanner.next();
            if (temp.equals("y")) {
                change(middle + 1, last);
                binarySearch(first, middle);
            } else if (temp.equals("n")) {
                change(first, middle);
                binarySearch(middle + 1, last);
            }
        } else {
            for (int i : numberArray) {
                if (i != -1) {
                    System.out.println("The number is: " + i);
                }
            }
        }
    }

    /**
     * replaces all the integer in the array to -1 as the number is not in this
     * range
     *
     * @param first - first element in the range
     * @param last - last element in the range
     */
    
    private void change(int first, int last) {
        for (int i = first; i <= last; i++) {
            numberArray[i] = -1;
        }
    }
}


