package Lecture6;

import java.util.Scanner;

public class FibonacciRecursion{

	public static void main(String[] args) {

		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int fn=0;
		int sn=1;
		int ans;
		if(n==0) {
			 ans=0;
		}
		else {
		 ans=fib(n , sn , fn);
		
        	}
		System.out.println(ans);
	}
	public static int fib(int n , int sn , int fn) {
		if(n<2) {
			return sn;
		}
		int sum=fn+sn;
		int ans=fib(n-1 , sum, sn);
		return ans;
	}
}


