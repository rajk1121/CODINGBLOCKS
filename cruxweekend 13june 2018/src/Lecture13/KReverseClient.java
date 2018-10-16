package Lecture13;

import java.util.Scanner;

public class KReverseClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		LinkedList help=new LinkedList();
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		for(int i=0 ; i<n; i++ ) {
			int data=s.nextInt();
			list.addAt(i,data);
			help.addAt(i,data);
		}
		list.KReverse(help , k);
		list.display();
	}

}
