package com.radha.logical_programs;

public class Remove_leading_and_ending_trail {

	public static void main(String[] args) {
		String given_string = " This program is to remove trailing ";
//
//		System.out.println(given_string.trim());
//		System.out.println(given_string.strip()); //supports only in java 11
//		System.out.println(given_string.stripLeading()); //supports only in java 11
//		System.out.println(given_string.stripTrailing()); //supports only in java 11

//		System.out.println(given_string.replaceAll("^[ \t]", "")); //removes the leading space by using regular expression
//		System.out.println(given_string.replaceAll("[ \t]$", "")); //removes the trailing space by using regular expression
		System.out.println(given_string.replaceAll("^[ ]|[ ]$", "@")); //removes the both leading and trailing space by using regular expression
	}
}
