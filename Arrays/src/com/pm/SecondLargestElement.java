package com.pm;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		
		int firstLargest = arr[0];
		int secondLargest = arr[1];
		
		if (arr[0] > arr[1]) 
		{
		    firstLargest = arr[0];
		    secondLargest = arr[1];
		} 
		else 
		{
		    firstLargest = arr[1];
		    secondLargest = arr[0];
		}

		
		for (int i = 2; i < arr.length; i++) {
		    int num = arr[i];
		    if (num > firstLargest) {
		        secondLargest = firstLargest;
		        firstLargest = num;
		    } else if (num > secondLargest && num != firstLargest) {
		        secondLargest = num;
		    }
		}

		
		System.out.println("Second Largest = " + secondLargest);

	}

}


/*Problem 3 (Medium): Find the Second Largest Element

Description:
Write a Java program to find the second largest number in an integer array.

Example:

Input: {12, 35, 1, 10, 34, 1}
Output: Second Largest = 34


Requirements:
Don’t use sorting or Collections (solve it using logic).
Handle duplicate values properly.
For example, in {10, 10, 9}, the second largest should be 9.

Hints:
Use two variables: firstLargest and secondLargest.
Traverse the array once to update both values.

*/
