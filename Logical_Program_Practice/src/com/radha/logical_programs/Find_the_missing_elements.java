package com.radha.logical_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class Find_the_missing_elements {
	
	public ArrayList<Character> method_1_find() {
		String find_element = "cklkh kl ,hv";
		find_element = find_element.toLowerCase();
		char[] toarray = find_element.toCharArray();
		int ascii_start = 97;
		ArrayList<Character> al = new ArrayList<>();
		for(int i=ascii_start;i<ascii_start+26;i++) {
			char getalphabet = (char) i;
			al.add(getalphabet);
		}
		ArrayList<Character> al2 = new ArrayList<>();
		for(Character fre : toarray) {
			al2.add(fre);
		}
		al.removeAll(al2);
		return al;
	}
	
	public String method2(ArrayList<Character> get_pre_method) {  //just to practice return function
		
		String modified = get_pre_method.toString().substring(1, get_pre_method.toString().length()-1);
		return modified;
	}
	
	public void method_3() {
		String find = "Cat";
		find=find.replaceAll(" ", "");
		String[] user_input=find.toLowerCase().split("");
		String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> hs = new HashSet<>(Arrays.asList(user_input)); //Arrays have the method asList to add elements in collection without looping
//		for(String str: user_input) {
//			hs.add(str);
//		}
		HashSet<String> hs1 = new HashSet<>(Arrays.asList(alphabets));
		hs1.removeAll(hs);
		System.out.println(hs1);
		Iterator<String> it = hs1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		System.out.println(hs1.toString().substring(1, hs1.toString().length()-1));
	}
	
	public void method4(String ...input1) {   //varargs which is called variable arguments. It takes the input as array of mentioned data type even if we mention string
		for (String i : input1) {
			System.out.print(i+" ");
		}
	}
	

	public static void main(String[] args) {
		Find_the_missing_elements fe = new Find_the_missing_elements();
//		System.out.println(fe.method_1_find());
//		System.out.println(fe.method2(fe.method_1_find()));
		fe.method_3();
//		fe.method4("radha","krishnan","divya","amma");
	}
}
