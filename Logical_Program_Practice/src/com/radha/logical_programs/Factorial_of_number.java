package com.radha.logical_programs;

public class Factorial_of_number {
	int inputvalue=5;
	
	public void factorialmethod() {  // method to find factorial number of input value 1*2*3*4*5=120
		int fact=1;
		int i=1;
		while(i<=inputvalue) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial number for "+inputvalue+" is: "+fact);
	}
	public static void main(String[] args) {
		Factorial_of_number fn = new Factorial_of_number();
		fn.factorialmethod();
	}

}
