package Geeks_For_Geeks;

//import java.util.HashMap;

public class Majority_Of_Element {
	
	static int majorityElement(int a[], int size)
	   {
	       int count = 1;
	       int ansIndex = 0;
	       for(int i=1;i<size;i++){
	           
	           
	           if(a[i] == a[ansIndex]){
	               count++;
	           }
	           else count--;
	           
	           if(count <= 0){
	               count = 1;
	               ansIndex = i;
	           }
	       }
	       
	       int freq  = 0;
	       
	       for(int i=0;i<size;i++){
	           if(a[i] == a[ansIndex]){
	               freq++;
	           }
	       }
	       
	       if(freq > size/2 )
	            return a[ansIndex];  //this logic works only for 5 numbers input.
	      
	      return -1;
	   }

	public static void main(String[] args) {
		int a[]={3,1,3,3,2};
		System.out.println(majorityElement(a, a.length));

	}

}
