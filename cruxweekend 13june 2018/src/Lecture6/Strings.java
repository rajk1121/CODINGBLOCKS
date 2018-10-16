package Lecture6;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		
		String str="Hello";
		int m=str.length();
		for(int i= 0 ; i<m ; i++) {
			for(int j=i+1 ; j<=m ; j++) {
				System.out.println(str.substring(i, j));
			}
			
		}
		String str1="acf";
		 m=str1.length();
		StringBuilder sb=new StringBuilder();
		sb.charAt(sb.length());
		for(int i=0 ; i<m-1 ; i++) {
			sb.append(str1.charAt(i));
			int b=str1.charAt(i+1)-str1.charAt(i);
			sb.append(b);
		}
		sb.append(str1.charAt(m-1));
		System.out.println(sb);
	}

}
