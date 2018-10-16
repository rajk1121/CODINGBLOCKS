package PRACTICE;

import java.util.Scanner;

import Lecture12.Stack;

public class NGEStack extends Stack{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner  s=new  Scanner (System.in);
		int q=s.nextInt();
		
		for(int i=0;i<q;i++) {
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int j=0 ; j<n;j++) {
				arr[j]=s.nextInt();
				
			}
			
			NGE(arr);
			
		}
	}
	public static void NGE(int[] arr) throws Exception {
	
		Stack stack=new Stack(arr.length);
		int size=0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			stack.push(arr[i]);
		}
		Stack stack1=new Stack(arr.length);
		int rv1=stack.pop();
		int rv2;
 		while(!stack.isempty()) {
			
			rv2=stack.pop();
			
			if(rv1<rv2) {
				System.out.println(rv1+","+rv2);
			}else {
				stack1.push(rv1);
			} 
			while(rv1<rv2) {
				if(!stack1.isempty()) {
					rv1=stack1.pop();
					if(rv1<rv2) {
						System.out.println(rv1+","+rv2);
					}else {
						stack1.push(rv1);
					}
					
				}else {
					break;
				}
			}
			rv1=rv2;
			}
		System.out.println(rv1+",-1");
		while(!stack1.isempty()) {
			int x=stack1.pop();
			System.out.println(x+",-1");
		}

	
	
	
}
	
		
		
		
	}




