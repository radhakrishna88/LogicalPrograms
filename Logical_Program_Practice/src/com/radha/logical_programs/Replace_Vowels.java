package com.radha.logical_programs;

public class Replace_Vowels {

	public static void main(String[] args) {
		String given_string = "Today is SundAy!";
//		char replace ='$';
		
		given_string = given_string.replaceAll("[aeiou]", "\\$");
		System.out.println(given_string);
		
//		for(int i=0;i<given_string.length();i++) {
//			if(given_string.charAt(i)=='a'|given_string.charAt(i)=='e'|given_string.charAt(i)=='i'|
//					given_string.charAt(i)=='o'|given_string.charAt(i)=='u'|given_string.charAt(i)=='A'|given_string.charAt(i)=='E'|given_string.charAt(i)=='I'|
//					given_string.charAt(i)=='O'|given_string.charAt(i)=='U') {
//				given_string=given_string.replace(given_string.charAt(i), replace);
//			}
//		}
//System.out.println(given_string);
		
	}

}
