/*
Number of ways to form Natural Number
--------------------------------------
Find number of ways an integer n can be represented as a sum of unique natural numbers.

Input
line 1: contains a single integer n.

Output
Print a single integer denoting number of ways to represent n.

Constraints
0<=n<=120

Sample Input
6
Sample Output
4
Explanation
6 can be represented as (1, 2, 3), (1, 5), (2, 4), (6).
*/

import java.io.*;
import java.util.*;
public class Main{
  public static int recur(int n,int start){
    if(n<0){
      return 0;
    }if(n==0){
      return 1;
    }int ans=0;
    for(int i=start;i<=n;i++){
      ans+= recur(n-i,i+1);
  
    }return ans;
    
  }
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
     int ans = recur(n,1);
    System.out.println(ans);
  }
}
