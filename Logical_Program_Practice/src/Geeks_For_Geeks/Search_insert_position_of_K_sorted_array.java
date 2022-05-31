package Geeks_For_Geeks;

public class Search_insert_position_of_K_sorted_array {
	static int searchInsertK(int arr[], int N, int k)
	{
		int index_value=-1;
		for(int i=0;i<N;i++) {
			if(arr[i]==k) {
				index_value=i;
				break;
			}
			if(index_value==-1){
				for(int j=0;j<N-1;j++) {
					if(k>arr[j]&&k<arr[j+1]) {
						index_value=j+1;
						break;
					}
					else if(k>arr[N-1]) {
						index_value=N;
						break;
					}
					else if(k<arr[j]){
						index_value=j;
						break;
					}
				}
			}
		}
		return index_value;
	}
	
	public static void main(String[] args) {
		int[] Arr = {1, 3, 5, 6,8};
		int N=Arr.length;
		int K=-1;
		System.out.println(searchInsertK(Arr,N,K));
	}
}
