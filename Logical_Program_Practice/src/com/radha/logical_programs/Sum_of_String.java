package com.radha.logical_programs;

public class Sum_of_String {
	String num1;
	String num2;
	public Sum_of_String(String firstnumber, String secondnumber) {  //constructor used to assign string value to the common attribute
		num1=firstnumber;
		num2=secondnumber;
		System.out.println("value one = "+firstnumber+"\n"+"Value two = "+secondnumber);
	}
	
	public void stringtoint() {   // Method used to convert string into integer and perform addition
		int sum1=Integer.parseInt(num1);
		int sum2=Integer.parseInt(num2);
		int sumoftwo= sum1+sum2;
		String tost = Integer.toString(sumoftwo);
		System.out.println("The Sum of two String is "+tost);
		
	}
	static   // Using static main method function inside class
	{
		Sum_of_String sos = new Sum_of_String("100","200");
		sos.stringtoint();
	}
	
	public static void main(String[] args) {


	}

}
