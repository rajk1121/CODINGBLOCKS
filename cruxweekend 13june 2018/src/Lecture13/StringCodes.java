package Lecture13;

import java.util.ArrayList;

import java.util.Scanner;

public class StringCodes {
    public static void main(String args[]) {
        // Your Code Here
    Scanner s=new Scanner (System.in);
		String str=s.next();
		ArrayList<String> list=new ArrayList();
		list=code(str);
		System.out.println(list.toString());
		
		
	}
	public static ArrayList<String> code(String str) {
		if(str.length()<=0) {
			ArrayList<String> base=new ArrayList();
			base.add("");
			return base;
		}
		
		
		ArrayList<String> myResult=new ArrayList();
		ArrayList<String> single=code(str.substring(1));
		for(int i=0 ; i<single.size() ; i++) {
			int c1=(int)str.charAt(0)-49+'a';
			char c=(char)c1;
			myResult.add(c+single.get(i));
		}
		if(str.length()>1) {
			ArrayList<String> two=code(str.substring(2));
			for(int i=0 ; i<two.size() ; i++) {
				int c1=(int)str.charAt(1);
				int c2=(int)str.charAt(0);
				int d=(c2-48)*10+(c1-48)+'`';
				char c=(char)d;
				if(c<='z') {
				myResult.add(c+two.get(i));
				}
			}
			}
		
	
		
		return myResult;
		
	}

}

