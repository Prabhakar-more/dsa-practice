package com.pm;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);    
		}
	
	}

}
