package com.radha.logical_programs;

public class FibonacciSeries {
	int serieslen=7;  //series length

	public void fibonaccifunction() { // fibonacci series method
		int num1=0,num2=1,num3;   
		System.out.print(num1+" "+num2); 
		for(int i=2; i<serieslen; i++) { 
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2; 
			num2=num3; 
		}
	}
	public static void main(String[] args) {
		FibonacciSeries fb = new FibonacciSeries();
		fb.fibonaccifunction();
	}
}
