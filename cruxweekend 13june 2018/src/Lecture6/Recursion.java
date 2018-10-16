package Lecture6;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		PDI(n);
		int fact=fact(n);
		System.out.println(fact);
		int power=power(5,2);
		System.out.println(power);
	}
	public static void PDI(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		PDI(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (n*fact(n-1));
		}
	}
	public static int power(int x, int n) {
		if(x==0) {
			return 1;
		}
		else {
			return (n*power(x-1,n));
		}
	}

}
