package PRACTICE;

import java.util.Scanner;

public class RecursiveDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=new String();
		str=s.next();
		int k=s.nextInt();
		int sum=0;
		for(int i=0 ; i<str.length() ; i++) {
			int x=str.charAt(i)-48;
			sum=sum+x;
		}
		sum=sum*k;
		str=""+sum;
		
		
		
		int ans=DigitSum(str , k);
		System.out.println(ans);
	
	}

	public static int DigitSum(String str, int k) {
		// TODO Auto-generated method stub
		if(str.length()==1) {
			int x=str.charAt(0)-48;
			return x;
		}
		int sum=0;
		String s1=new String();
		for(int i=0 ; i<str.length() ; i++) {
			int x=str.charAt(i)-48;
			sum=sum+x;
		}
		s1=s1+sum;
		int ans=DigitSum(s1, k);
		
		
		
		return ans;
		
	}

}
