/*
Print Pattern
-----------------------
Print a sequence of numbers starting with N, without using loop, in which A[i+1] = A[i] - 5, if A[i]>0, else A[i+1] = A[i] + 5 repeat it until A[i]=N.

Note:- Once you change an operation you need to continue doing it till possible.

Input
The only line contains an integer, n.
Constraints
0 < N < 1000
Output
Print the pattern with space-separated integers.

Example
Sample Input

16
Sample Output

16 11 6 1 -4 1 6 11 16
Sample Input

10
Sample Output

10 5 0 5 10
Explanation

We basically first reduce 5 one by one until we reach a negative or 0. After we reach 0 or negative, we one by one add 5 until we reach N.
*/

import java.util.*;
import java.io.*;
public class Main {
    static void recur(int n,int start,int turn)
    {
        System.out.print(n+" "); // 11
        // base case
        if(n==start && turn==1) // 11+5 == 16
        {
            return; 
        }
        
        //recursive case
        if(turn==1)
        {
            recur(n+5,start,turn);
        }
        else
        {
            if((n-5)>0)
            {
                recur(n-5,start,turn);
            }
            else
            {
                recur(n-5,start,1);
            }
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recur(n,n,0);
    }
}
