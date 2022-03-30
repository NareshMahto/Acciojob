/*
Alt matrix sum
You are given a chessboard of size N x N, where the top left square is black. Each square contains a value. Find the sum of values of all black square and all
white squares.

Remember that in a chessboard black and white squares alternate. Input User task: Input consists on N and the the numbers in the NxN matrix. You need to print
out the sum of black squares and then white squares in the next line.

Constraints:-
1 <= N <= 1000
1 <= Matrix[i][j] <= 100000
Output
Print two lines, first line containing the sum of black squares and second line containing the sum of white squares.

Example
Input:
3
1 2 3
4 5 6
7 8 9
Output:
25
20
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int blackSum=0, whiteSum=0;
      int[][] arr = new int[n][n];
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          arr[i][j]=sc.nextInt();
        }
      }
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          if((i+j)%2 == 0)
            blackSum=blackSum+arr[i][j];
          else
            whiteSum=whiteSum+arr[i][j];
        }
      }
      System.out.println(blackSum);
      System.out.println(whiteSum);
    }
}
