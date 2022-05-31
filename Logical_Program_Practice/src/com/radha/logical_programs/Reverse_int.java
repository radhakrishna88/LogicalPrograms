package com.radha.logical_programs;

public class Reverse_int {
	public static void main(String[] args) {
		
		int given = 1234;
		int reverse=0;
//		String rev = Integer.toString(given);
//		for(int i=rev.length()-1;i>=0;i--) {
//			System.out.print(rev.charAt(i));
//		}
//		for(reverse=0;given!=0;reverse--) {
//			reverse = reverse*10;
//			reverse = reverse+given%10;
//			given = given/10;
//		}
		while(given!=0) {
			reverse = reverse*10;
			reverse = reverse+given%10;
			given = given/10;
		}
		System.out.println(reverse);
	}
}