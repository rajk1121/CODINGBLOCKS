package Lecture10;

import java.util.Scanner;

public class Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		if(x%2==0) {
			long ans=power(x/2,n);
			System.out.println(ans*n);
		}
		else {
			long ans=power(x/2,n);
			System.out.println(ans*ans*n);
		}
		

	}
	public static long power(int x , int n) {
		if(x==0) {
			return 1;
		}
		
		long ans=n*power(x-1 , n);
		return ans;
		
	}

}
