package PRACTICE;

import java.util.Scanner;

import Lecture12.Stack;
//WRONG

public class TextEditor extends Stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			Scanner s=new Scanner (System.in);
			int T=s.nextInt();
			Stack stack=new Stack(T);
			
			
			for(int i=0 ; i<T ; i++) {
				int n=s.nextInt();
				if(n==1) {
					String str=new String();
					str=s.next();
					if(stack.size()==0) {
						stack.push(str);
					}else {
					stack.add(str);
				}
					}
				else if(n==2) {
					int k=s.nextInt();
					stack.remove( k );
				}else if(n==3) {
					int k =s.nextInt();
					stack.print(k );
				}else {
					stack.pop();
				}
				
			}
			
	}

	public void push(String item) throws Exception{
	if(this.size()==this.capacity) {
		String[] arr=new String[2*this.data.length];
		for(int i=0 ; i<this.data.length ; i++) {
			arr[i]=this.data[i];
			
		}
		this.data=arr;
	}
	super.push(item);
	}
	
	

	
}
