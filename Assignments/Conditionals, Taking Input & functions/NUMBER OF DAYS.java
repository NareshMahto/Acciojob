/*
NUMBER OF DAYS
Given the number of the month, your task is to calculate the number of days present in the particular month.

Note:- Consider non-leap year

User task: Since this is a functional problem you do not have to worry about the input. You just have to complete the function numberofdays() which contains M as a parameter.

Constraints:- 1 <= M <= 12

Output Print the number of days in the particular month.

Example Input

1
Output

31
*/

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int year, month;
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			System.out.print(31);
		else
			System.out.println(30);
	}
}
