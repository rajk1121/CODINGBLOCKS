package PRACTICE;

import java.util.Scanner;

public class RainwaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i]=s.nextInt();
		}
		int ans=Rainwater(arr);
		System.out.println(ans);
	}

	private static int Rainwater(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		left[0]=arr[0];
		right[arr.length-1]=arr[arr.length-1];
		//for calculating left most max element
		for(int i=1 ; i<arr.length;i++) {
			if(arr[i]<left[i-1]) {
				left[i]=left[i-1];
			}else  {
				left[i]=arr[i];
			}
			
		}
		//for calculating rightmost max element
		for(int j=arr.length-2 ; j>=0;j--) {
			if(arr[j]>right[j+1]) {
				right[j]=arr[j];
			}else {
				right[j]=right[j+1];
			}
		}
		for(int i=0 ; i<arr.length;i++) {
			ans=ans+Math.min(left[i], right[i])-arr[i];
		}
		return ans;
	}

}
