/*
MISSING ELEMENT IN AP
Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Note: There will always be only one missing element.

Input
line 1: contains an integer n denoting size of array.

line 2: contains n spaced integers denoting elements of array.

Output
Print a single integer denoting the missing element of AP.

Constraints
1<=n<=10^6

1<=arr[i]<=10^6

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)

Sample Input
6
2 4 8 10 12 14
Sample Output
6
Explaination
*/

import java.io.*;
import java.util.*;
class Main
{
	public static int findMissingTerm(int[] nums)
	{
		int left = 0, right = nums.length - 1;

		int diff = (nums[nums.length - 1] - nums[0]) / nums.length;
		while (left <= right)
		{
			int mid = right - (right - left) / 2;
			if (mid + 1 < nums.length && nums[mid + 1] - nums[mid] != diff) {
				return nums[mid + 1] - diff;
			}
			if (mid - 1 >= 0 && nums[mid] - nums[mid - 1] != diff) {
				return nums[mid - 1] + diff;
			}
			if (nums[mid] - nums[0] != (mid - 0) * diff) {
				right = mid - 1;
			}

			else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        int nums[]=new int[n];
      for(int i=0; i<n; i++){
        nums[i]=sc.nextInt();
      }
		System.out.println(findMissingTerm(nums));
	}
}
