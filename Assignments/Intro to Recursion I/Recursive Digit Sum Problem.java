/*
Recursive Digit Sum Problem
--------------------------------------
We define super digit of an integer n using the following rules:
Given an integer, we need to find the super digit of the integer n.
If n has only 1 digit, then its super digit is n.
Otherwise, the super digit of n is equal to the super digit of the sum of the digits of n.

superDigit has the following parameter(s):

string n: a string representation of an integer
int k: the times to concatenate n to make p.

Input
The first line contains two space separated integers, n and k.

Constraints:
1 <= n <= 10^100000
1 <= k <= 100000

Output
In a new line, print the the super digit of n repeated k times.

Example
Input:
148 3
Output:
3
Explanation:
Here n=148 and k=3 , so p=148148148.

super_digit(p) = super_digit(148148148) 
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      int k = sc.nextInt();
      int sumD=0;
      int len=n.length()-1;
      while(len>=0)
      {
        sumD=sumD+n.charAt(len)-'0';
        len--;
      }
      int p = sumD*k;
      System.out.println(superDigit(p));
  }
  public static int superDigit(int x)
  {
     if(x<10)
       return x;

    int sum=0;
    while(x>0)
    {
      sum=sum+x%10;
      x=x/10;
    }
    return superDigit(sum);
  }
}
