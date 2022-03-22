import java.util.*;
public class Main { 
    public static void main (String args[]) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for( int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int index = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start<=end) {
			int mid = (start + end )/2;
			if(x == arr[mid]) {
				index = mid;
				break;
			}
			else if(x < arr[mid]) {
				end = mid - 1;
			}
			else	 {
				start = mid +1;
			}
		}
		System.out.print(index);
	}
}
