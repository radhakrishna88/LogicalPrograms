package com.radha.logical_programs;

public class Swap_Number{

	public static void main(String[] argu){
		int a = 200;
		int b = 300;

		System.out.println("Before swapping: number1 = "+a+" number2 = "+b);

//		int swap = a;  //using third variable
//		a = b;
//		b = swap;
		
//		a = a-b;  //using addition and subtraction
//		b = a+b;
//		a = b-a;
		
		  a ^= b;  //using XOR to swap the number without third variable
		  b ^= a;
		  a ^= b; 
		
//		a = a*b; //using multiplication and division
//		b = a/b;
//		a = a/b;

		System.out.println("after swapping: number1 = "+a+" number2 = "+b);
	}
}