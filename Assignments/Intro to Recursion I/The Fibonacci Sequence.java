/*
The Fibonacci Sequence
The Fibonacci sequence appears in nature all around us, in the arrangement of seeds in a sunflower and the spiral of a nautilus for example.

The Fibonacci sequence begins with fibonacci(0)=0 and fibonacci(1)=1 as its first and second terms. After these first two elements, each subsequent element is equal to the sum of the previous two elements.

Programmatically:

fibonacci(0)=0 fibonacci(1)=1 fibonacci(n)=fibonacci(n-1)+fibonacci(n-2)

Given n, return the nth number in the sequence.

n=5
The Fibonacci sequence to 6 is fs=[0,1,1,2,3,5,8].With zero-based indexing,fs[5]=5. 
Problem description
Complete the code in the editor.

Input:
Contains a single integer,n.

Output:
int: the nth element in the Fibonacci sequence

Constraints
0<n<=30

Print the absolute difference between the sums of the two diagonals of the matrix as a single integer.

Sample Input
3
Sample Output
2

Explanation
The Fibonacci sequence begins as follows:

fibonacci(0)=0 fibonacci(1)=1 fibonacci(2)=(0+1)=1 fibonacci(3)=(1+1)=2 fibonacci(4)=(1+2)=3 fibonacci(5)=(2+3)=5 fibonacci(6)=(3+5)=8

In the sequence above, fibonacci(3) is 2.
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int f1=0, f2=1, temp;
      if(n==0)
        System.out.print(f1);
      if(n==1)
        System.out.print(f2);
      for(int i=2; i<=n; i++){
        temp=f1+f2;
        f1=f2;
        f2=temp;
      }
      System.out.print(f2);
    }
}
