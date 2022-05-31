package Geeks_For_Geeks;

import java.util.ArrayList;

public class Plus_one {
	
	static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
		String allnum = "";
		for(int i=0;i<N;i++) {
			allnum =allnum+arr.get(i).toString();
		}
		arr.removeAll(arr);
		int total = Integer.parseInt(allnum);
		total=total+1;
		String[] starr =Integer.toString(total).split("");
		for(String addtoin : starr) {
			arr.add(Integer.parseInt(addtoin));
		}
		return arr;
	}

//	static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
//
//		String allnum = "";
//		for(int i=0;i<N;i++) {
//			allnum =allnum+arr.get(i).toString();
//		}
//		int total = Integer.parseInt(allnum);
//		total=total+1;
//		arr.removeAll(arr);
//		arr.add(total);
//
//		return arr;
//	}

	public static void main(String[] args) {
		int arr1[] = {9,9,9};
		int N = arr1.length;
		ArrayList<Integer> arr =new ArrayList<Integer>();
		for(Integer in : arr1) {
			arr.add(in);
		}

		System.out.println(increment(arr,N));

	}

}
