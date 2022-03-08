/*Program for Bubble Sort
Stable and Adaptive code
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for( int i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	    }
	    bubbleSort(arr);
	    for(int i=0; i<n; i++){
	        System.out.print(arr[i] + " ");
	    }
	}
	
	public static void bubbleSort(int []arr){
	   int n= arr.length;
	   boolean flag = false;
	   for(int i=1; i<n-1; i++){
	       flag = false;
	       for(int j=0; j< n-i; j++){
	           if(arr[j] > arr[j+1]){
	               int temp = arr[j];
	               arr[j] = arr[j+1];
	               arr[j+1] = temp;
	               flag = true;
	           }
	       }
	       
	       if(flag == false){
	           break;
	       }
	   }
	}
}
