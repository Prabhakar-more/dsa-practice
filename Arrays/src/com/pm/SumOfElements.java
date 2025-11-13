package com.pm;

public class SumOfElements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of elements is : "+sum);
		
	}

}

/*Problem 1 (Easy): Sum of Elements

Description:
Write a Java program to:

Take an integer array (you can hardcode it, e.g. {1, 2, 3, 4, 5})
Calculate the sum of all elements
Print the sum

Input: {1, 2, 3, 4, 5}
Output: Sum = 15

*/