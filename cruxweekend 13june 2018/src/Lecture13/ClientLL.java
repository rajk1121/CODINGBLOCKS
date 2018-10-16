package Lecture13;


import java.util.Scanner;

public class ClientLL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		Scanner s=new Scanner (System.in);
//		int N=s.nextInt();
		int T=s.nextInt();
		
		for(int i=0 ; i<T ; i++) {
			int data=s.nextInt();
			list.addLast(data);
		}
		list.hasCycle();
		
//		for(int i=0 ; i<N ; i++) {
//			list.addAt(i, s.nextInt());
//		}
//		list.removeDuplicates(list.head);
//		list.display();
//		list.oddeven();
//		list.display();
//		int n=s.nextInt();
//		if(n>list.size()){
//		    while(n>list.size()){
//		        n=n-list.size();
//		    }
//		}
//		
//		if(n==list.size()) {
//			list.display();
//			return;
//		}
//		list.kthNode(n);
//		list.display();
//
	}

}
