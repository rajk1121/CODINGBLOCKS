package PRACTICE;

import java.util.Scanner;

import Lecture12.Stack;

public class EqualStacks extends Stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int o=s.nextInt();
		int arr[]=new int[m];
		for(int i=0 ;i<m ; i++) {
			arr[i]=s.nextInt();
		}
		Stack stack1=new Stack(m);
		for(int i=m-1 ; i>=0 ; i--) {
		
			stack1.push(arr[i]);
		}
		int arr1[]=new int[n];
		for(int i=0 ;i<n ; i++) {
			arr1[i]=s.nextInt();
		}
		Stack stack2=new Stack(n);
		for(int i=n-1 ; i>=0 ; i--) {
			
			stack2.push(arr1[i]);
		}
		int arr3[]=new int[o];
		for(int i=0 ;i<o ; i++) {
			arr3[i]=s.nextInt();
		}
		Stack stack3=new Stack(o);
		for(int i=o-1 ; i>=0 ; i--) {
			
			stack3.push(arr3[i]);
		}
		int sum1=stack1.sum();
		int sum2=stack2.sum();
		int sum3=stack3.sum();
		EqualStacks(stack1 , stack2 , stack3 , sum1 , sum2 , sum3);
		int sum=stack1.sum();
		System.out.println(sum);
		
	}
	public static void EqualStacks(Stack stack1, Stack stack2, Stack stack3 , int sum1 , int sum2 ,int sum3 ) throws Exception {
		
		if(sum1<sum2 ) {
			int rv=stack2.pop();
			sum2=sum2-rv;
			EqualStacks(stack1 , stack2 , stack3 , sum1 , sum2 , sum3);
			return;
			
		}else if(sum1>sum2) {
			
			int rv=stack1.pop();
			sum1=sum1-rv;
			EqualStacks(stack1 , stack2 , stack3 , sum1 , sum2, sum3);
			return;
		}else if(sum2<sum3) {
			int rv=stack3.pop();
			sum3=sum3-rv;
			EqualStacks(stack1 , stack2 , stack3 , sum1 , sum2 , sum3);
			return;
		}else if(sum2>sum3) {
			int rv=stack2.pop();
			sum2=sum2-rv;
			EqualStacks(stack1 , stack2 , stack3 , sum1 , sum2 , sum3);
			return;
		}
		
		
	}
	

}
