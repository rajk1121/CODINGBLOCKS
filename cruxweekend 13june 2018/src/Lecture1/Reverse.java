 package Lecture1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int m=n;
		int k=22,count;
		count=0;
		while(k!=0) {
			k=m%10;
			m=m/10;
				count++;
			
		}
		for(int i=1 ; i<count ; i++) {
			int l= n%10;
			System.out.print(l);
			n=n/10;
		}

	}

}
