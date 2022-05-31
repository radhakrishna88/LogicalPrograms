package Geeks_For_Geeks;

public class Rotate_An_Array{
	//Function to rotate an array by d elements in counter-clockwise direction. 
	static void rotateArr(int arr[], int d, int n)
	{
		int temp[] = new int[d];
		for(int i =0;i<d;i++) {
		temp[i]=arr[i];
		}
		for(int j=0,m=d;j<n-d;j++,m++){
			arr[j]=arr[m]; 
		}
		for(int k=n-d,l=0;l<d;k++,l++) {
			arr[k]=temp[l];
		}
		for(int a : arr) {
			System.out.print(a);
		}
	}

	public static void main (String[] args){
		int arr[] = {1,2,3,4,5};
		Rotate_An_Array.rotateArr(arr,2,5);
	}
}