package com.pm.string_basics;

//IQ (Muatability and immutability)
public class Test1 
{
	public static void main(String[] args)
	{
		//String
		//String is immutable once we created then we cant change
		String s = new String("Prabhakar");
		s.concat("More");//concat() only works with String
		System.out.println(s);//output : Prabhakar
		
		

		//StringBuffer
		//StringBuffer is mutable once we created then we can change
		StringBuffer sb = new StringBuffer("Prabhakar ");
		sb.append("More");//append() works only with StringBuffer
		System.out.println(sb);//output : Prabhakar More
	}

}
