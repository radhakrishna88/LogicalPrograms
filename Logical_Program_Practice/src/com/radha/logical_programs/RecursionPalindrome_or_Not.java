package com.radha.logical_programs;

import java.util.Scanner;

public class RecursionPalindrome_or_Not {
	
	static boolean yn;
	
	private void palindrome_check(String in,int nm) { //method to check palindrome.
		String tolower = in.toLowerCase();
		int dc = nm+1;
		if(nm<tolower.length()) {
			if(tolower.charAt(nm)==tolower.charAt(in.length()-dc)){
				yn=true;
				palindrome_check(in,nm+1);   //Using recursion method
			}
			else {
				yn=false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check Palindrome or not:"); 
		String usinput = scan.nextLine();
		scan.close();

		RecursionPalindrome_or_Not prn = new RecursionPalindrome_or_Not();
		prn.palindrome_check(usinput,0);

		if(yn == true) {
			System.out.println("The given string is a palindrome.");
		}
		else {
			System.out.println("The given string  is (not) a palindrome.");
		}

	}

}
