package com.pm;

public class FindTheMaximumElement {

	public static void main(String[] args) {
		int[] arr= {10, 25, 3, 89, 45};
		
		int max = arr[0];
		for(int num : arr)
		{
			if(num > max)
				max=num;
		}
		
		System.out.println("Maximum Element Is : "+max);
		

	}

}


/*Problem 2 (Easy–Medium): Find the Maximum Element

Description:
Write a Java program to find and print the largest element in an integer array.

Example:
Input: {10, 25, 3, 89, 45}
Output: Maximum number = 89

*/