package Lecture9;

import java.util.ArrayList;
import java.util.Scanner;

public class Keypad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		ArrayList<String> list=new ArrayList();
		  list.add("abc");
	        list.add("def");
	        list.add("ghi");
	        list.add("jkl");
	        list.add("mno");
	        list.add("pqrs");
	        list.add("tuv");
	        list.add("wx");
	        list.add("yz");
	        int rev=0;
	        int rem=0;
	        while(n!=0){
	            rem=n%10;
	            rev=rev*10+rem;
	            n=n/10;
	        }
	            
	        int count=Keypad(rev , 0 ,"", list);
	        System.out.println(count);
	        Keypad(rev , "" , list);
	}
	public static void Keypad(int n , String res , ArrayList<String> list) {
		if(n==0) {
			System.out.print(res+" ");
			return;
		}
		
		
		int m=n%10;
		String mystring=new String();
		mystring=list.get(m-1);
		for(int i=0 ; i<mystring.length() ; i++) {
			char cc=mystring.charAt(i);
			String res1 = new String();
			res1=res;
			res1=res1+cc;
			m=n/10;
			Keypad(m , res1 , list);
		}
	}
//
	public static int Keypad(int n , int count ,String res , ArrayList<String> list) {
		if(n==0) {
			
			count++;
			return count;
			
		}
		
		
		int m=n%10;
		String mystring=new String();
		mystring=list.get(m-1);
		for(int i=0 ; i<mystring.length() ; i++) {
			char cc=mystring.charAt(i);
			String res1 = new String();
			res1=res;
			res1=cc+res1;
			m=n/10;
			count =Keypad(m ,count , res1 , list);
		}
		return count;
	}

}
