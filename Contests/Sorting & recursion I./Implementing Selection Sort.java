/*
Implementing Selection Sort
----------------------------------
Given an array A[] of size N, containing positive integers. You need to sort the elements of array using the Selection sort algorithm.

Input
The first line of input is the size of array N and the second line consists of N array elements separated by space.

Constraints:
1 <= N <= 10^5
-10^6 <= A[i] <= 10^6

Output
Print the sorted array in a new line.

Example
Input:
5
4 1 3 9 7
Output:
1 3 4 7 9 
Explanation:
The array after perfoming Selection sort: 1 3 4 7 9.

Input:
10
10 9 8 7 6 5 4 3 2 1
Output:
1 2 3 4 5 6 7 8 9 10
Explanation:
The array after performing Selection sort: 1 2 3 4 5 6 7 8 9 10.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
      }  selectionSort(arr);
      for(int i=0;i<n;i++ ){
        System.out.print(arr[i]+" ");
      }
	}public static void selectionSort(int arr[]){
      int n= arr.length;
      int minIndex;
      for(int i=0;i<n-1;i++){
        minIndex=i;
        for(int j=i+1;j<n;j++){
          if(arr[j]< arr[minIndex]){
            minIndex=j;
          }
        }int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
      }
    }
}
