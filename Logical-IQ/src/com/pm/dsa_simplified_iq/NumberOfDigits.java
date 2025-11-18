package com.pm.dsa_simplified_iq;

import java.util.Scanner;

//Q. Count Number Of Digits in a Number

public class NumberOfDigits {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		long number = sc.nextLong();
		
		int count = 0;
		
		while(number>0)
		{
			number = number/10;
			count++;
			
		}
		
		System.out.println("Number Of Digits in a Number is : "+count);

	}

}
