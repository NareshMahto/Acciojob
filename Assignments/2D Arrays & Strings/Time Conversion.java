/*
Time Conversion
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: -
12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.

12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example
S = 12:01:00PM

Return 12:01:00

S = 12:01:00AM

Return 00:01:00

Function Description
Complete the code in the editor. It should take the input string and return a new string representing the input time in 24 hour format.

Input
string s: a time in 12 hour format

Output
string: the time in 12 hour format

Input Format
A single string that represents a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM).

Constraints
All input times are valid

Sample Input 0
07:05:45PM

Sample Output 0
19:05:45
*/

import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
   
    public static String changetime(String input)
        throws ParseException
    {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");
       
        // Change the pattern into 24 hour format
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output = "";
       
        // Converting the input String to Date
        time = dateFormat.parse(input);
       
        // Changing the format of date
        // and storing it in
        // String
        output = format.format(time);
        return output;
    }

  
    public static void main(String[] arg)
        throws ParseException
    {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
        System.out.println(changetime(s));
    }
}
