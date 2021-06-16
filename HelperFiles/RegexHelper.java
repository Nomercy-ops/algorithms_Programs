package com.bridgelabz.Algorithm.HelperFiles;

import com.bridgelabz.Algorithm.Models.UserDetails;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is the Regex Helper class.
 *  All the required variable and methods are define here.
 * 
 */

public class RegexHelper {
    
    // regex pattern for matching.
    private final String REGEX_NAME = "<<name>>";
    private final String REGEX_FULLNAME = "<<full name>> ";
    private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
    private final String REGEX_DATE = "01/01/2016";

    BufferedReader bufferedReader,buffReader;
    
    // created constructor for initoializing bufferReader.
    public RegexHelper() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Here user input is read by buffer reader.
     * @return user input string
     */
    
    public String inputWord() {
        try {
            return bufferedReader.readLine();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return " ";
    }
    
    /**
     *  Here file reader will read the file.txt from system and using string builder,
     * we will perform append and separate the line.
     * @param fileName
     * @return strings build by string builder
     * @throws IOException 
     */

    public String getFileText(String fileName) throws IOException {

        try {

            buffReader = new BufferedReader(new FileReader(fileName));
            StringBuilder stringBuilder = new StringBuilder();
            String line = buffReader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = buffReader.readLine();
            }
            return stringBuilder.toString();
        } catch (IOException exception) {
            return null;
        } 
      
    }
    
    /**
     * Here we perform pattern matching and replacing operation.
     * pattern matcher will compile the string declared inside final variable and match with message.
     * and matcher class will replace the details that are to be replaced.
     * @param user is the details got from inputword.
     * @param message is the one got from string builder operation
     * @return 
     */

    public String convertString(UserDetails user, String message) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(message);
        message = matcher.replaceAll(user.getFirstName());

        pattern = Pattern.compile(REGEX_FULLNAME);
        matcher = pattern.matcher(message);
        message = matcher.replaceAll(user.getFirstName() + user.getLastName());

        pattern = Pattern.compile(REGEX_MOBILE_NO);
        matcher = pattern.matcher(message);
        message = matcher.replaceAll(user.phoneNumber());

        pattern = Pattern.compile(REGEX_DATE);
        matcher = pattern.matcher(message);
        message = matcher.replaceAll(user.date());
        return message;

    }

    //format date object in this format 01/12/2016 
    public String getFormatedDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }
    
    /**
     * This method is used for printing the final customize message.
     * @param Message from pattern matcher
     */

    public static void printMessage(String Message) {

        System.out.println(Message);
    }

}
