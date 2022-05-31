package com.radha.logical_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Interview_Question {

	public static void main(String[] args) {
		String given = "software testing";
		Object[] sp =given.split(" ");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		
		
		char[] tochar = given.replaceAll(" ", "").toCharArray();
		Arrays.sort(tochar);
		System.out.println(tochar);
		
		
		Set<Character> st = new HashSet<>();
		for(Character cr : tochar) {
			st.add(cr);
		}
		Iterator<Character> it = st.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
}
