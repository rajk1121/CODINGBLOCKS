package PRACTICE;

import java.util.Scanner;

public class CountAAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String str=new String();
		str=s.next();
		int count=AAA(str,0);
		System.out.println(count);
		System.out.println(AAAgap(str ,0));
		
	}
	public static int AAA(String str , int i) {
		if(i>str.length()-3) {
			return 0;
		}
		int count=0;
		if(str.charAt(i)=='a'&&str.charAt(i+1)=='a'&&str.charAt(i+2)=='a') {
			count++;
			
		}
		count=count+AAA(str, i+1);
		return count;
		
	}
	public static int AAAgap(String str  , int i) {
		if(i>str.length()-3) {
			return 0;
		}
		int count=0;
		if(str.charAt(i)=='a'&&str.charAt(i+1)=='a'&&str.charAt(i+2)=='a') {
			count++;
			
		}
		count=count+AAAgap(str, i+3);
		return count;
		
		
	}

}
