/*
Celsius to Fahrenheit
Given a temperature C in Celsius, your task is to convert it into Fahrenheit using the following equation:- F = C × 9/5 + 32

Input:
An integer, representing the Temperature in Celsuis.

User Task:
Convert the given temperature to Fahrenheit and print it.

Note:
It is guaranteed that C will be a multiple of 5.

Output:
Return a integer containing converted temperature in Fahrenheit.

Illustration:
Sample Input :
25

Sample Output:
77

Sample Input:-
-40

Sample Output:-
-40
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner s=new Scanner(System.in);
      int c =s.nextInt();
      int f ;
      f = c * 9 / 5 + 32;
      System.out.println(f);
    }
}
