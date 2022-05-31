package com.radha.logical_programs;

public class String_Based_Logical_Programs {
	String data_1;
	String data_2;
	String data_3;

	String_Based_Logical_Programs() {   // Input Data in constructor
		String input_1 = "I am Sharan3593";
		String input_2 = "I am from INDIA, Delhi is the capital of India, India i the second most populated country";
		String input_3 = "Sharavanan";
		data_1=input_1;
		data_2=input_2;
		data_3=input_3;
	}

	public void requitement_1() {       //reverse the words present in the string
		System.out.println("Requirement 1:");
		String[] arraylist_1 = data_1.split(" ");
		for(int i=arraylist_1.length-1; i>=0; i--) {
			System.out.print(arraylist_1[i]+" ");
		}
		System.out.println();
		System.out.println("***********************************");
	}

	public void requitement_2() {                  //Reverse the only text of the word without changing the string order.
		System.out.println("Requirement 2:");
		String[] arraylist_2 = data_1.split(" ");
		for(int i=0; i<arraylist_2.length; i++) {
			String reverse_string = " "+arraylist_2[i];
			StringBuffer strf = new StringBuffer();
			strf.append(reverse_string);
			System.out.print(strf.reverse());
		}
		System.out.println("\n***********************************");
	}

	public void requitement_3() {         // count the number of same word present inside the string
		System.out.println("Requirement 3:");
		String data_2lcase = data_2.toLowerCase();
		String[] arraylist_3=data_2lcase.split("india");
		
		System.out.println(arraylist_3.length-1);
		System.out.println("***********************************");
	}

	public void requirement_4() {            // convert a string into alphabetical order
		System.out.println("Requirement 4:");
		char chararray[] = data_3.toLowerCase().toCharArray();
		for(int i=0; i<chararray.length; i++) {
			for(int j=i+1; j<chararray.length; j++) {
				if(chararray[i]>chararray[j]) {
					char temp_for_swap=chararray[i];
					chararray[i]=chararray[j];
					chararray[j]=temp_for_swap;
				}
			}
		}
		System.out.println(chararray);
		System.out.println("***********************************");
	}

	public void requirement_5() {                   //Reverse the string without using reverse function.
		System.out.println("Requirement 5:");
		int stlen=data_3.length()-1;
		for(int i=stlen;i>=0;i--) {
			System.out.print(data_3.charAt(i));
		}
	}

	public static void main(String[] args) {
		String_Based_Logical_Programs sti = new String_Based_Logical_Programs();
		sti.requitement_1();
		sti.requitement_2();
		sti.requitement_3();
		sti.requirement_4();
		sti.requirement_5();

	}

}
