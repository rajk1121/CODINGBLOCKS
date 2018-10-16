package Lecture13;

import java.util.Scanner;

public class OddEvenLLClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		LinkedList list=new LinkedList();
		int n=s.nextInt();
		for(int i=0 ; i< n ; i++) {
			list.addAt(i, s.nextInt());
		}
		list.oddeven();
		list.display();
		

	}

}
