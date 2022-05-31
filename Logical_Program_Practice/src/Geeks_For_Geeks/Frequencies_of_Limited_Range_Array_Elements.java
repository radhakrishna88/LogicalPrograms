package Geeks_For_Geeks;

public class Frequencies_of_Limited_Range_Array_Elements {

	public static void frequencyCount(int arr[], int N, int P)
	{
		int count=0;
		int freq[]=new int[P];
		for(int i=1,j=0;i<=N;i++,j++) {
			for(int k=0;k<N;k++) {
				if(i==arr[k]) {
					count++;
				}
			}
			freq[j]=count;
			count=0;
		}
		for(int i=0;i<N;i++) {
			arr[i]=freq[i];
		}
		for(int in : arr) {
			System.out.print(in+" ");
		}
	}
	
//	public static void frequencyCount(int arr[], int N, int P)  //use visualizer to understand this. lots of math! OMG
//    {
//        for(int i=0;i<N;i++)
//            arr[i] -= 1;
//        for(int i=0;i<N;i++)
//            if(arr[i]%P < N)
//                arr[arr[i]%P] += P;
//        for(int i=0;i<N;i++)
//            arr[i] /= P;
//        for(int ar : arr) {
//        	System.out.print(ar+" ");
//        }
//    }

	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 3, 5};
		int P = 5;
		int n = arr.length;
		frequencyCount(arr,n,P);
	}

}
