package Geeks_For_Geeks;

import java.util.ArrayList;

public class Alternate_positive_and_negative_numbers {
	
	void rearrange(int arr[], int n) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i=0;i<n;i++) {
        	if(arr[i]>=0) {
        		positive.add(arr[i]);
        	}
        	else {
        		negative.add(arr[i]);
        	}
        }
        
        for(int j=0,m=0;j<n;j=j+2,m++) {
        		arr[j]=positive.get(m);
        }
        for(int k=1,l=0;k<n;k=k+2,l++) {
        		arr[k]=negative.get(l);
        }
        for(int all : arr) {
        	System.out.print(all+" ");
        }
    }

	public static void main(String[] args) {
		
		int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
		int N = Arr.length;
		Alternate_positive_and_negative_numbers apn = new Alternate_positive_and_negative_numbers();
		apn.rearrange(Arr, N);
		

	}

}
