package com.radha.logical_programs;

public class Sum_the_numerics_present_in_string {

	public static void main(String[] args) {
		String given_string = "ja8va456";
		int sum=0;
		for(int i=0;i<given_string.length();i++) {
			char check = given_string.charAt(i);
			if(Character.isDigit(check)) {
				sum=sum+Character.getNumericValue(check);
			}
			else if(Character.isDigit(check)==false) {
				System.out.print(check);
			}
		}
		System.out.println(sum);
	}
}
