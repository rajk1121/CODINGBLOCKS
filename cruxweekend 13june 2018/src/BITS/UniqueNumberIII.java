package BITS;

import java.util.Scanner;

public class UniqueNumberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0 ; i<n;i++) {
			arr[i]=s.nextInt();
		}
		int ans=UniqueNumber(arr);
		System.out.println(ans);
	}

	private static int UniqueNumber(int[] arr) {
		// TODO Auto-generated method stub
		int[] arr1=new int[32];
		for(int i=0;i<arr.length;i++) {
			int no=arr[i];
			int j=0;
			while(no>0) {
				arr1[j]=arr1[j]+(no&1);
//				System.out.println(arr1[j]);	
				no=no>>1;
				j++;
			}
			
		}
		int ans=0;
		int power=1;
		for(int i=0 ;i<arr1.length;i++) {
			arr1[i]=arr1[i]%3;
			ans=ans+arr1[i]*power;
			power=power*2;
		}
		
		return ans;
	}

}
