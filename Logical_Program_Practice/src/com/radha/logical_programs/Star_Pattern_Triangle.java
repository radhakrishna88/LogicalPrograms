package com.radha.logical_programs;

public class Star_Pattern_Triangle{

	public static void main(String[] argu){
		int row,column;
		int startnumber = 1;

		for(row = 1;row<=5;row++){
			for(column = 1;column<=row;column++){
				System.out.print(startnumber+" ");
				startnumber = startnumber+1;
			}
			System.out.println();
		}
		
//		int row,column;    //pyramid pattern
//
//		for(row = 1;row<=5;row++){
//			for(int i=5-row;i>=1;i--) {
//				System.out.print(" ");
//			}
//			for(column = 1;column<=row;column++){
//
//				System.out.print("* ");
//			}
//			System.out.println();
//		
	}
}