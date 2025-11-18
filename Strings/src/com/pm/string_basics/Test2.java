package com.pm.string_basics;

public class Test2 
{

	public static void main(String[] args) 
	{
		String s1 = new String("Prabhakar");
		String s2 = new String("Prabhakar");
		//(== is used for reference comparison then only it will return true)
		System.out.println(s1==s2);//false
		System.out.println(s1==s1);//true
		System.out.println(s1.equals(s2));//true
		

		
		
		StringBuffer sb1 = new StringBuffer("Prabhakar");
		StringBuffer sb2 = new StringBuffer("Prabhakar");
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		
		
	}

}
