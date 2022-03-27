/*
Binary Search
-----------------
-Arrays must be sorted.
-First select start index, than End index and Mid index
-Start index = 0
-End index = (Length of array - 1)
-Mid index = (Start index + End index) / 2

*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    int key = sc.nextInt();
	    int arr[] = new int[n];
	    for( int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    int index = binarySearch(arr, n, key);
	    System.out.print(index);
	}
	static int binarySearch(int arr[], int n, int key){
	    int l=0, h = n-1;
	    while ( l <= h){
	        int mid = (l + h) / 2;
	        if  (key == arr[mid]){
	            return mid;
	        }
	        if (key < arr[mid]){
	            h =  mid-1;
	        }
	        if (key > arr[mid]){
	            l = mid + 1;
	        }
	    }
	    return -1;
	}
}
