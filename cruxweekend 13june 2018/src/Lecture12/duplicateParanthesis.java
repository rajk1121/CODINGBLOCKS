 package Lecture12;

import java.util.Scanner;

public class duplicateParanthesis {

	public static void main(String[] args) throws Exception { 
		Scanner s=new Scanner (System.in);
		int T=s.nextInt();
		for(int j=0  ;j<T ; j++) {
			int l=0;
		String str=new String();
		str=s.next();
		Stack stack = new Stack(str.length());
		for(int i=0 ; i<str.length();i++) {
			if(str.charAt(i)!=')') {
				stack.push(str.charAt(i));
			}
			else {
				char q=stack.pop();
				char r=stack.pop();
				stack.push(q);
				stack.push(r);
				if(r=='(') {
					System.out.println("Duplicate Found ");
					l++;
					break;
					
				}
			}			
			

		}
		if(l==0){
			System.out.println("No Duplicate Found ");
		}
		}
		
		
	}
	

}
