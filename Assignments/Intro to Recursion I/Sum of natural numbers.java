/*
Sum of natural numbers
For an integer N, your task is to calculate the sum of first N natural numbers and print it.

Input
The integer N.

Output
Print the sum of first N natural numbers.

Example
Input
5

Output
15

Explanation
1+2+3+4+5 = 15

Input
1

Output
1
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
