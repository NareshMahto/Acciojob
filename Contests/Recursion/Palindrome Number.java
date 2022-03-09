/*
Palindrome Number
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.

Input
The line inputs N.

Constraints:
1 <= N <= 9999

Output
You need to print "true" if the number is palindrome otherwise "false".

Example
Input:
5

Output:
true

Input:
121

Output:
true 
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int originalN=n;
      int reverse=0;
      while(n>0){
        int a=n%10;
        reverse= reverse*10 + a;
        n=n/10;
      }if(originalN==reverse){
        System.out.println("true");
      }else{
        System.out.println("false");
      }
    }
}
