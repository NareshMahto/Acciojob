/*
Fahrenheit to Celsius
Given a temperature F in Fahrenheit, your task is to convert it into Celsius using the following equation:-

T(°c) = (T(°f) - 32)*5/9

Input

User Task: You have to take an input F and then convert Fahrenheit To Celsius.

Constraints:-

-10^3 <= F <= 10^3

Note:- It is guaranteed that F - 32 will be a multiple of 9.

Output

Return an integer containing converted temperature to Celsius.
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner s=new Scanner(System.in);
      int f =s.nextInt();
      int c ;
      c = ((f-32)*5)/9;
      System.out.println(c);
    }
}
