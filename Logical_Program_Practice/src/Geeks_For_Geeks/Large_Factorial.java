package Geeks_For_Geeks;

public class Large_Factorial {

	public long[] factorial(long a[], int n) {
		for(int i=0;i<n;i++) {
			long temp=1;
			long arr_find=a[i];
			for(int j=1;j<=arr_find;j++) {
				temp *=j;
			}
			a[i]=temp;
			temp=1;
		}	
		return a;
	}

	public static void main(String[] args) {
		long A[] = {0, 1, 2, 3, 4};
		int N = A.length;
		Large_Factorial lf = new Large_Factorial();
		
		for(long ln : lf.factorial(A, N)) {
			System.out.print(ln+" ");
		}

	}

}
