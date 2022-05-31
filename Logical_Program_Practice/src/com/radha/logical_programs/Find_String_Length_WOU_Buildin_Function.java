package com.radha.logical_programs;

import java.util.Scanner;

public class Find_String_Length_WOU_Buildin_Function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String given_string = sc.nextLine();
		sc.close();
		
		char [] string_to_array = given_string.toCharArray();
		int count = 0;
		for(@SuppressWarnings("unused") char chr : string_to_array) {
			count++;
		}
		
		System.out.println(count);

	}
}
