package com.radha.logical_programs;

public class Find_the_numer_of_vowels {

	public static void main(String[] args) {
		String given = "AeioU";
		given=given.toLowerCase();
		int total_vowels =0;
		for(int i=0;i<given.length();i++) {
			if(given.charAt(i)=='a'|given.charAt(i)=='e'|given.charAt(i)=='i'|
					given.charAt(i)=='o'|given.charAt(i)=='u') {
				total_vowels++;
			}
		}
		System.out.println("Total number of vowels present in the string is : "+total_vowels);

	}

}
