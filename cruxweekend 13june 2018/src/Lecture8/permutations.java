package Lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner (System.in);
			String str=s.next();
			Ascii(str , "");
			getperm(str , "");
			ArrayList<String> list1=BoardPath(10 , 0);
			System.out.println(list1);
			ArrayList<String> list=getperm(str );
		System.out.println(list);
	}
	public static void Ascii(String str, String res) {
		
		if(str.length()==0) {
			System.out.println(res);
			return;
			
		}
		
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		Ascii(ros , res);
		Ascii(ros , res+cc);
		Ascii(ros , res+(int)cc);
		
		
	}
		public static ArrayList<String> getperm(String str){
			if(str.length()==0) {
				ArrayList<String> base = new ArrayList();
				base.add("");
				return base;
			}
			
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myResult=new ArrayList();
		ArrayList<String> recResult=getperm(ros);
		for(int i=0 ; i<recResult.size() ; i++) {
			String recstring = recResult.get(i);
			for(int j=0 ; j<recstring.length() ; j++) {
				String mystring=new String();
				mystring = str.substring(0, j) + cc+ str.substring(j);
				myResult.add(mystring);
			}
			
			
		}
		return myResult;
			
		}
		public static void getperm(String str , String res ) {
			if(str.length()==0) {
				System.out.println(res);
			}
			
			for(int i=0 ; i<str.length()-1 ; i++) {
				char cc=str.charAt(i);
				String ros=str.substring(0 ,i)+str.substring(i+1);
				getperm(ros , res+cc);
			}
		}
		public static ArrayList<String> BoardPath(int end , int curr){
		if(curr==end) {
			ArrayList<String> base=new ArrayList();
			base.add("");
			return base;
		}
		if(curr>end) {
			ArrayList<String>  base=new ArrayList();
			base.add("");
			return base;
		}
			ArrayList<String> myResult=new ArrayList();
			ArrayList<String> recResult=null;
			for(int dice=1 ; dice<=6 ; dice++) {
				recResult=BoardPath(end , curr+dice);
				for(int j=0 ; j<recResult.size() ; j++) {
					myResult.add(dice+recResult.get(j));
					
				}
			}
			return myResult;
		}
}
