package com.radha.logical_programs;

public class PalindromeOrNot {

	public static void main(String[] args) {

		String given = "amma";
		String rev = "";
		for (int i = given.length() - 1; i >= 0; i--) {
			rev = rev + given.charAt(i);
		}

		if (given.equals(rev)) {
			System.out.println("The given String is palindrome");
		} else
			System.out.println("The given String is not a palindrome");
	}
}
