package Lecture8;

import java.util.Scanner;

public class IsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String str=s.next();
		StringBuilder sb = new StringBuilder();
		boolean ans=Is(str , 0  ,sb);
		System.out.println(ans);
				

	}
	public static boolean Is(String str , int si , StringBuilder sb) {
		if(si==str.length()) {
			if(sb.length()==0) {
				return true;
			}
			else
				return false;
		}
		
		if(str.charAt(si)=='('|| str.charAt(si)=='{' || str.charAt(si)=='[') {
			sb.append(str.charAt(si));
		}
		 if(str.charAt(si)==')'|| str.charAt(si)=='}' || str.charAt(si)==']') {
			 if(sb.length()==0) {
				 return false;
			 }
			 else {
			 
			sb.deleteCharAt(sb.length()-1);
			 }
			 }
		 boolean ans=Is(str , si+1 , sb);
		 return ans;
	}

}
