package com.radha.logical_programs;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.ListIterator;

public class Find_Element {
	
	
	public static void main(String[] args) {
		String[] find_elements = {"tiger","cat","cheeta","cow"};
		String search = "cow";
		
		
		boolean check = false;
		
		for(int i=0;i<find_elements.length;i++) {
			if(search==find_elements[i]) {
				check=true;
			}
			
		}
//		if(check==true)
//			System.out.println("the element present");
//		else
//			System.out.println("element is not present");
		
//		ArrayList<String> arl = new ArrayList<>();
//		for(String psv : find_elements) {
//			arl.add(psv);
//		}
//		boolean check = arl.contains(search);
		
//		String st1 = "the element is present";
//		String st2 = "the element is not present";
//		
//		String st3 = check==true?st1:st2; //using ternary operator to replace if and else but ternary operator always pick the higher value data type and replace the existing data type.
//	
//		System.out.println(st3);
		
		if(check==true)
			System.out.println("the element present");
		else
			System.out.println("element is not present");
		
	}
}
