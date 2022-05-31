package com.radha.logical_programs;

public class Odd_or_Even {
	public static void main(String [] args){
		int[] given = {0,1,2,5,9,8,10};
		
		System.out.print("Even Numbers : ");
		for(int i=0;i<given.length;i++) {   //even number
			if(given[i]%2==0) {
				System.out.print(given[i]+" ");
			}
		}
			System.out.println();      //odd number
			System.out.print("Odd Numbers : ");
			for(int j=0;j<given.length;j++) {
				if(given[j]%2!=0) {
					System.out.print(given[j]+" ");
				}
			}
		}
	}

