package Lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class getSSforNStrins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		for(int i=0 ; i<n ; i++) {
			String s1=new String();
			s1=s.next();
			getSS(s1 , "");
		}
		

	}
	public static void getSS(String str , String res ){
		if(str.length()==0) {
			System.out.println(res);
			return;
		}
		
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		getSS(ros , res);
		getSS(ros , res+cc);
		
		
	}

}
