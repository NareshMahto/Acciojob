/*
Program to quick sort
using pivoit value = (low + high) / 2
and recursion
*/

package sorting;
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for ( int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        QuickSort qs = new QuickSort();
        qs.quickSortRecursion(arr, 0, n-1);
        qs.printArray(arr);

    }
    int partition( int arr[], int low, int high){
        int pivot = arr[(low + high) / 2];

        while ( low <= high){
            while ( arr[low] < pivot){
                low++;
            }
            while ( arr[high] > pivot){
                high--;
            }
            if (low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    void quickSortRecursion(int arr[], int low, int high){
        int pi = partition( arr, low, high);
        if ( low < pi-1){
            quickSortRecursion(arr, low, pi-1);
        }
        if ( pi < high){
            quickSortRecursion(arr, pi, high);
        }
    }

    void printArray(int arr[]){
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
