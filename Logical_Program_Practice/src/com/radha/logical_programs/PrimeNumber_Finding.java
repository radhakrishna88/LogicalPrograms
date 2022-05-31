package com.radha.logical_programs;

public class PrimeNumber_Finding {

	public static void main(String[] args) {
//		int given  = 71; 
//		
//		int count = 0;
//		for(int i=1;i<=given;i++) {   //given divided by 1 or by itself
//			if(given%i==0) {
//				count++;
//			}
//		}	
//		if(count!=2)
//			System.out.println("Not a Prime number");
//		else
//			System.out.println("It's a prime number");
		
		int range = 100;
		for(int i=1;i<=range;i++) {
			int count1=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count1++;
				}
			}
			if(count1==2) {
				System.out.println(i+" ");
			}
		}
	}
}
