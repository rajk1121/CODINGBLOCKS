package Lecture9;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class CodeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);
		String str=s.next();
		StringBuilder sb=new StringBuilder();
		ArrayList<String> list=new ArrayList();
		for(int i=str.length()-1 ; i>=0 ; i--) {
			sb.append(str.charAt(i));
		}
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
		ArrayList<String> single=code(str.substring(0, str.length()-1));
		
		for(int i=0 ; i<single.size() ; i++) {
			int c1=(int)str.charAt(str.length()-1)-49+'a';
			char c=(char)c1;
			myResult.add(single.get(i)+c);
		}
		if(str.length()>1) {
			ArrayList<String> two=code(str.substring(0,str.length()-2));
			for(int i=0 ; i<two.size() ; i++) {
				int c1=(int)str.charAt(str.length()-1);
				int c2=(int)str.charAt(str.length()-2);
				int d=(c2-48)*10+(c1-48)+'`';
				char c=(char)d;
				myResult.add(two.get(i)+c);
			}
			}
		return myResult;
		
	}

}
