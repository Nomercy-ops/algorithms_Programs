/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 Purpose : is to perform task optimization using number of task,
 * deadline and time.
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

// importing helper files from Utility class.
import com.bridgelabz.Algorithm.HelperFiles.Utility;

public class TaskOptimization {

    // int array to store deadline and time
    int[] deadlineArray, timeArray;
    int count;

    /**
     * This is the main method task optimization class.
     *  from here start method is called using class object.
     * @param args
     */
    
    public static void main(String[] args) {
        // class object
        TaskOptimization optimisation = new TaskOptimization();
        optimisation.start();
    }

    /**
     *  This is the start method and it is used to get user input of tasks.
     * it also store deadline and time into an array.
     * it also performs insertion sort and do task method for printing tasks.
     */
    
    private void start() {

        // getting number of tasks
        System.out.print("Enter Number of tasks: ");
        count = Utility.scanner.nextInt();

        deadlineArray = new int[count];	// array to store deadlines
        timeArray = new int[count];	// array to store time required for each task

        //gets tasks data
        for (int i = 0; i < count; i++) {
            System.out.print("Enter deadline and time required for the task number :" + (i + 1) + " ");;
            deadlineArray[i] = Utility.scanner.nextInt();
            timeArray[i] = Utility.scanner.nextInt();
        }
        Utility.scanner.close();
        
        //orders tasks in ascending order of deadline 
        insertionSortAsc();

        //prints the tasks
        for (int i = 0; i < count; i++) {
            System.out.print("Enter deadline and time required for the task number :" + (i + 1) + " ");;
            System.out.print(deadlineArray[i] + "\t");
            System.out.print(timeArray[i]);
            System.out.println();
        }

        doTask();
    }

    /**
     * This method when called orders the tasks in ascending order of deadline 
     */
    
    private void insertionSortAsc() {
        for (int i = 1; i < deadlineArray.length; i++) {
            int deadlineKey = deadlineArray[i];
            int timeKey = timeArray[i];
            int j = i - 1;
            while ((j > -1) && (deadlineArray[j] > deadlineKey)) {
                deadlineArray[j + 1] = deadlineArray[j];
                timeArray[j + 1] = timeArray[j];
                j--;
            }
            deadlineArray[j + 1] = deadlineKey;
            timeArray[j + 1] = timeKey;
        }
    }

    /**
     *  method for printing task.
     */
    private void doTask() {
        for (int i = 0; i < count; i++) {
            System.out.println("Task " + (i + 1) + ":" + timeArray[i - 1]);
        }
    }
}
