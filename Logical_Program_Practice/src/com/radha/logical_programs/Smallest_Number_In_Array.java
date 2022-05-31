//Logic to find the smallest number in the array and also find the largest number in the column of found smallest number
package com.radha.logical_programs;

public class Smallest_Number_In_Array {
	
	public static void main(String[] args) {
		
		int[][] matrix_3x3 = {{2,4,10},{6,3,8},{1,9,5}};
		
		int min=Integer.MAX_VALUE;  //matrix_3x3[0][0]
//		int row_index=0;
		int column_index=0;
		int largest_in_column=0;
		System.out.println("Given 3x3 Matrix :");
		for(int i=0;i<matrix_3x3.length;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix_3x3[i][j]+" ");
				if(matrix_3x3[i][j]<min) {
					min=matrix_3x3[i][j];
					//row_index=i;
					column_index=j;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Minimum value = "+min);
//		System.out.println("row = "+row_index+"\n"+"column = "+column_index);
		for(int k=0;k<matrix_3x3.length;k++) {
			if(matrix_3x3[k][column_index]>largest_in_column) {
				largest_in_column = matrix_3x3[k][column_index];
			}
		}
		System.out.println("largest number in the column is = "+largest_in_column);
	}
}
