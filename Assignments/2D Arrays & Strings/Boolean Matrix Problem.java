/*
Boolean Matrix Problem
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1. Now, if any row of the
matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.

Input
The first line of contains m and n denoting number of rows and number of columns. Then next m lines contain n elements denoting the elements of the matrix.

Constraints:
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}
Output
In a new line, print the modified matrix.

Example
Input:
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
Explanation:
rows = 5 and columns = 4

The given matrix is

1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that row will be filled too. Finally, 
the last row contains a 1 and therefore it needs to be filled with 1 too. The final matrix is

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int mat[][]=new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        mat[i][j]=sc.nextInt();
      }
    }for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(mat[i][j]==1){
          for(int k=0;k<n;k++){
            mat[i][k]=1;
          }
        } 
      }
    }for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        System.out.print(mat[i][j]+" ");
      }System.out.println();
    }
    }
}
