package PRACTICE;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int n=s.nextInt();
		int[] arr= new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0 ; i<n ; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		int[] count = new int[max];
		for(int i= 0 ; i<n ; i++) {
			count[arr[i]-1]++;
		}
		int sum=0;
		for(int i=0 ; i<max ; i++) {
			count[i]=sum+count[i];
			sum=count[i];
		}
		
		int[] seq = new int[n];
		for(int i=0 ; i<n ;i++) {
			seq[count[arr[i]-1]-1]=arr[i];
			count[arr[i]-1]--;
		}
		for(int i=0 ; i<n ; i++) {
			System.out.println(seq[i]);
		}
		

	}

}
