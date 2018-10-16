package BITS;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=Index(n);
		System.out.println(ans);

	}

	private static int Index(int n) {
		// TODO Auto-generated method stub
		int index=0;
		int power=1;
		int x=0;
		while(n!=0) {
			x=n%10;
			if((x^4)==0) {
				index=index+(power*2)/2;
			}
			else if((x^7)==0) {
				index=index+(power*2);
			}
			power=power*2;
			n=n/10;
		}
		return index;
	}

}
