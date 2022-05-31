package com.radha.logical_programs;

public class ToUpper_or_Lower_Case_WOU_Methods {

	public static void main(String[] args) {
		String given = "This program is to change the casing without using Built in method.";
		char[] string_to_array = given.toCharArray();
		for(int i=0;i<string_to_array.length;i++) {
			if(string_to_array[i]>=97 && string_to_array[i]<=123) {
				string_to_array[i] = (char) (string_to_array[i]-32);
			}
		}
		for(char charloop : string_to_array) {
			System.out.print(charloop);
		}
	}
}
