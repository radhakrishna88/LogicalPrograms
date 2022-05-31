package com.radha.logical_programs;

public class LeapYearChecker {

	int year = 1994;  //variable

	public void leapyear_conditions() {  // Method is to check the given year leap year or not
		if(year % 400 == 0) {   
			System.out.println("The year "+year +" is leap year.");
		}
		else if (year % 100 == 0 ) {
			System.out.println("The year "+year +" is not a leap year.");
		}
		else if (year % 4 == 0) {
			System.out.println("The year "+year +" is leap year.");
		}
		else {
			System.out.println("The year "+year +" is not a leap year."); 
		}
		
	}

	public static void main(String[] args) {
		LeapYearChecker lp = new LeapYearChecker();
		lp.leapyear_conditions();
		

	}

}
