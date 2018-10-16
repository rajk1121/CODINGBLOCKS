package Lecture10;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,6,1,5,8,4};
		int sorted[] = mergeSort(arr , 0 , arr.length-1);
		for(int i=0 ; i<sorted.length ; i++) {
			System.out.println(sorted[i] + " ");
		}

	}
		public static int[] mergeSort(int[] arr ,int  low ,int   high) {
			if(low==high) {
				int[] base=new int[1];
				base[0]=arr[low];
				return base;
			}
			int mid=(low+high)/2;
			int[]one=mergeSort(arr , low , mid);
			int[] two = mergeSort(arr , mid+1, high);
			int[] sorted = merge(one , two);
			return sorted;
		}
		public static int[] merge(int[] one , int[] two) {
			
			
			int i=0 ;
			int j=0;
			int k=0;
			int[] three=new int[one.length+two.length];
			while(i<one.length && j<two.length) {
				if(one[i]<=two[j]) {
					three[k]=one[i];
					i++;
					
				}
				else {
					three[k]=two[j];
					j++;
					
				}
				k++;
				
			}
			while(i<one.length) {
				
					three[k]=one[i];
					i++;
					k++;
				
			}
			while(j<two.length) {
				three[k]=two[j];
				j++;
				k++;
			}
			return three;
		}
}
