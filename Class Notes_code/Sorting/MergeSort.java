import java.util.*;
public class Main {
public static void printSort(int[]arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
}
public static int[] mergeSort(int[] arr1,int[]arr2){
    int m=arr1.length;
    int n=arr2.length;
    int[] arr=new int[m+n];
    int i=0;
    int j=0;
    int k=0;
    while(i<m && j<n){
        if(arr1[i]<=arr2[j]){
            arr[k]=arr1[i];
            i++;
            k++;
        }else{
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
    while(i<m){
        arr[k]=arr1[i];
        i++;
        k++;
    }
    while(j<n){
        arr[k]=arr2[j];
        j++;
        k++;
    }
    return arr;
}
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int arr1[] = new int[m];
    for(int i=0 ;i<m ; i++){
        arr1[i] = sc.nextInt();
    }
    int n = sc.nextInt();
    int arr2[] = new int[n];
    for( int i=0; i<n; i++){
        arr2[i] = sc.nextInt();
    }
    int arr3[]=mergeSort(arr1,arr2);
    printSort(arr3);
    }
}
