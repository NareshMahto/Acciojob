/*
HRECURS - Hello Recursion
--------------------------------
You will be given an array of N integers. Write a recursive function to calculate its summation.

####Input

Input starts with an integer T (T ≤ 100), the number of test cases.

Each of the next T lines will start with an integer N (1 <= N <= 100), number of integers followed by N space separated. Each of these N integers will be between -1000 and 1000 (inclusive).

####Output

For each test case, output one line in the format “Case x: a” (quotes for clarity), where x is the case number and a is the summation of the integers.

Sample Input
Input:
2
5 10 5 -2 3 0
3 100 -10 34
Sample Output
Output:
Case 1: 16
Case 2: 124
Explanation
You just have to get the sum, which is an easy in task iteratively. Try it recursively.
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t= sc.nextInt();
      for(int i=1;i<=t; i++){
        int n= sc.nextInt();
        int arr[] = new int[n]; 
        for(int j = 0;j<n ; j++){
          arr[j] = sc.nextInt();
        }
        int ans = ar(arr, n-1);
        System.out.println("Case "+i+": "+ans);
      }
    }
    public static int ar(int[] arr,int n){
      if(n==0){
        return arr[n];
      }
      int sum  = arr[n]+ ar(arr , n-1);
      return sum;
    }
}
