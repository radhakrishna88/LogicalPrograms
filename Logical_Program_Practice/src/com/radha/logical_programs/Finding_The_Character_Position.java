package com.radha.logical_programs;


//import java.util.Scanner;

public class Finding_The_Character_Position {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		String get = "Z";
		char given = get.toLowerCase().charAt(0);
		int toascii = (int) given;
	
		int position = toascii-96;
		System.out.println(position);
//		sc.close();
	}

}
