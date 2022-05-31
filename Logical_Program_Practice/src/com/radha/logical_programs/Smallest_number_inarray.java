package com.radha.logical_programs;

public class Smallest_number_inarray {

	public static void main(String[] args) {
		int[] given_array = {2,8,1,3,5,7};
		
		int smallest = Integer.MAX_VALUE;
		
		for(int in : given_array) {
			if(in<smallest) {
				smallest=in;
			}
		}
		System.out.println(smallest);
	}

}
