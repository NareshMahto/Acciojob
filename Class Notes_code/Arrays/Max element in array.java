/*
find maximum elements in java
-----------------------------
*/

import java.util.*;
class NoofPair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for ( int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int maxx  = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i] > maxx){
                maxx = arr[i];
            }
        }

    }
}
