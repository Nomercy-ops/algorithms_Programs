/**
 * ******************************************************************************************
 * @author :Rikesh Chhetri
 * @version :1.0 
 * Purpose :is to Customize Message Demonstration using String Function and RegEx
 * 
 * @date :15-06-2021
 * ******************************************************************************************
 */

package com.bridgelabz.Algorithm;

// importing helper file and user details models
import com.bridgelabz.Algorithm.HelperFiles.RegexHelper;
import com.bridgelabz.Algorithm.Models.UserDetails;

import java.io.IOException;
import java.util.*;

public class CustomizeMessageUsingRegex {

    /**
     * This is the main method for  customize message using regex class.From here user input has been taken and set it to input word method of regex helper class.
     * For getting and setting user input user details model is created and imported here.
     * 
     * @param args
     * @throws IOException 
     */
    
    public static void main(String args[]) throws IOException {
        
        // creating object for UserDetails class
        UserDetails userDetails = new UserDetails();
        // creating object for RegexHelper class
        RegexHelper helper = new RegexHelper();

        // taking user input and setting to inputword method
        System.out.println("Enter FirstName:");
        userDetails.setFirstName(helper.inputWord());

        System.out.println("Enter LastName:");
        userDetails.setLastName(helper.inputWord());

        System.out.println("Enter MobileNumber: ");
        userDetails.setPhoneNumber(helper.inputWord());

        //Setting Currrent date
        userDetails.setDate(helper.getFormatedDate(new Date()));

        System.out.println(helper.convertString(userDetails, helper.getFileText("file.txt")));

    }

}
