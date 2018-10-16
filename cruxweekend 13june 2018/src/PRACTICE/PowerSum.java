package PRACTICE;

import java.util.Scanner;

public class PowerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int N=s.nextInt();
		System.out.println((int)Math.pow(2, 2));
		int ans=PowerSum(0 , X , N , 1);
		System.out.println(ans);
	}
	public static int PowerSum(int sum , int X , int N , int num) {
		int count=0;
		if(sum==X) {
			return 1;
		}
		if(sum>X) {
			return 0;
		}
		for(int i=num ; i<X ; i++) {
			int pow=(int)(Math.pow(i, N));
		sum=sum+pow;
		if(sum==X || sum<X) {
			count=count+PowerSum(sum, X, N, i+1);
			sum=sum-pow;
		}
		else {
			 break;
		}
		}
		return count;
		
		
		
		
	}

}
