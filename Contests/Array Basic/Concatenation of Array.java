/*
Concatenation of Array
-----------------------------------
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Print the ans array

Input:
The first line of the input contains the number 𝑛(length of array) The next n integers denotes the elements of the array.

Output:
Print the concatenated array

Constraints:
n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
Sample Input 1
3
1 2 1
Sample Output 1
 1 2 1 1 2 1
Explanation
The array ans is formed as follows:

ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
ans = [1,2,1,1,2,1]
Sample Input 1
4   
1 3 2 1
Sample Output 1
1 3 2 1 1 3 2 1
Explanation
The array ans is formed as follows:

ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
ans = [1,3,2,1,1,3,2,1]
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
      }
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
      }
    }
}
