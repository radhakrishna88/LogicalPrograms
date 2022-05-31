package com.radha.logical_programs;

public class Reverse_String {

	public static void main(String[] args) {
		String car = "volkswagen";
		
		StringBuilder st = new StringBuilder();
		st.append(car);
		Object rv = st.reverse();
		System.out.println(rv);
	}
}