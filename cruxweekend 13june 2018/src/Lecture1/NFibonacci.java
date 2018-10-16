package Lecture1;

import java.util.Scanner;

public class NFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n = s.nextInt();
		int a=0;
		int b = 1;
		int sum = a+b;
		if(n==0) {
			System.out.println(0);
		}
		else {
		
		
		for(int j = 1; j<(n-1) ; j++ ) {
			
			a=b;
			b=sum;
			sum = a+b;
		}
		System.out.println(sum);
		}
	

}
}
