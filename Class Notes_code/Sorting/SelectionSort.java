
/*
selection sort 
by swapping value
*/
package sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort( arr, n);
        print( arr, n);
    }
    static void selectionSort(int arr[],int n){
        int min, temp;
        for(int i=0; i<n; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    static void print(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
