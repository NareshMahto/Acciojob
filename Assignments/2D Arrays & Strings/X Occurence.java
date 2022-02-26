/*
X Occurence
For a given number N, Consider a table of N X N in which elements at the intersection of ith row and jth column are the product of i and j, i. e i x j. Also given a positive integer X. Your task is to count the number of elements in the table that contain the integer X.

Input User Task: Write a program that takes the integer N and the integer X as parameter.

Constraints:- 1 <= N <= 10^5 1 <= X <= 10^9

Output Return the count of X.

Example: Sample Input:- 5 5

Sample Output:- 2

Explanation:- table :- 1 2 3 4 5 2 4 6 8 10 3 6 9 12 15 4 8 12 16 20 5 10 15 20 25

Count of occurrence of X is : 2

Sample Input:- 10 13

Sample Output:- 0
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
     // int m=1;
      int count=0;
      int x=sc.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
        if(x==(i*j)){
          count++;
        }
      }
    }System.out.println(count);
}
}
