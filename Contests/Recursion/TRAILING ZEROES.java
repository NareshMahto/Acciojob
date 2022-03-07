/*
TRAILING ZEROES
For an integer n find the number of trailing zeroes in n!.

Input
line 1: contains an integer n.

Output
Print a single integer denoting number of trailing zeroes in n.

Constraints
1<=n<=10^9

Expected Time Complexity: O(logn)

Expected Space Complexity: O(1)

Sample Input
5

Sample Output
1
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int c =0;
      int r = 0;
      for(int i=0;i<20;i++){
        r = n/5;
        c = c+ r;
        if(r>=5){
          n = r;
        }
        else{
          break;
        }
    }
      System.out.println(c);
      }
}
