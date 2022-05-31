package com.radha.logical_programs;

public class Finding_The_Character_Count {

	public static void main(String [] args){
		String sentence = "Java logical program";
		char find = 'O';  //character to find from sentence
		find =Character.toLowerCase(find);
		sentence = sentence.toLowerCase();
		
//		int count = 0; 
//		for(int i=0;i<sentence.length();i++) {
//			if(sentence.charAt(i)==find){
//				count++; } 
//		} 
//		System.out.println(count);
		

		String char_to_string = Character.toString(find);  //converting char data type to String
		String replace_char = sentence.replace(char_to_string , "");
		int result = sentence.length()-replace_char.length(); //subtraction
		System.out.println(result);
	}
}
