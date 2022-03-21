import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    insertionSort(arr);
	    printSort(arr);
	}
	public static void printSort(int arr[]){
	    int n = arr.length;
	    for( int i=0; i<n; i++){
	        System.out.print(arr[i] + " ");
	    }
	}
	public static void insertionSort(int arr[]){
	    int n = arr.length;
	    for ( int i=1; i<n; i++){
	        //insert ith element in soered position
	        int j = i-1;
	        int temp = arr[i];
	        while (j>-1 && arr[j] > temp){
	            arr[j+1] = arr[j];
	            j--;
	        }
	        arr[j+1] = temp;
	    }
    }
}
