package com.pm.dsa_simplified_iq;

import java.util.Scanner;

//Factorial of a Number       3!= 3*2*1=6
public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		
		int factorial = 1;
		
		for(int i=1; i<=number; i++)
		{
			factorial = factorial*i;
			//factorial*=i;
		}
		
		System.out.println("Factorial of number "+number+" is : "+factorial);
		sc.close();

	}

}
