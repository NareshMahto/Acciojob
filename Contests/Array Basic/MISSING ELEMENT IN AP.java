/*
MISSING ELEMENT IN AP
--------------------------------
Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Note: There will always be only one missing element.

Input
line 1: contains an integer n denoting size of array.

line 2: contains n spaced integers denoting elements of array.

Output
Print a single integer denoting the missing element of AP.

Constraints
1<=n<=10^6

1<=arr[i]<=10^6

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)

Sample Input
6
2 4 8 10 12 14
Sample Output
6
Explaination
*/

import java.io.*;
import java.util.*;
class Main
{
	public static void main (String args[])
	{
      Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      int arr[] = new int[n];
      for (int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      int d = arr[1]-arr[0];
      for (int i=0; i<n-1; i++){
        if ((arr[i+1]-arr[i]) != d)
          System.out.print(arr[i]+d);
      }
	}
}
