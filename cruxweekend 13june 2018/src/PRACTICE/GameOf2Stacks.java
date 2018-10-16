package PRACTICE;

import java.util.Scanner;

import Lecture12.Stack;

public class GameOf2Stacks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int g=s.nextInt();
		for(int i=0 ; i<g ; i++) {
			int n=s.nextInt();
			int m=s.nextInt();
			int x=s.nextInt();
			int arr[]=new int[n];
			int arr1[]=new int[m];
			for(int j=0 ; j<n ; j++) {
				arr[j]=s.nextInt();
			}
			for(int j=0 ; j<m  ; j++) {
				arr1[j]=s.nextInt();
			}
			Stack stack1=new Stack(n);
			for(int j=n-1;j>=0;j--) {
				stack1.push(arr[j]);
			}
			Stack stack2=new Stack(m);
			for(int k=m-1 ; k>=0 ; k--) {
				stack2.push(arr1[k]);
			}
			int ans=game(stack1 , stack2 , x,0);
			System.out.println(ans);
		}
		
		
	}

	private static int game(Stack stack1, Stack stack2,int x,int sum) throws Exception {
		// TODO Auto-generated method stub
		if(sum>x) {
			return -1;
		}
		int rv=stack1.pop();
		sum=sum+rv;
		int ans1=1+game(stack1, stack2, x, sum);
		stack1.push(rv);
		sum=sum-rv;
		int rv2=stack2.pop();
		sum=sum+rv2;
		int ans2=1+game(stack1, stack2, x, sum);
		stack2.push(rv2);
		return Math.max(ans1, ans2);
	}

}
