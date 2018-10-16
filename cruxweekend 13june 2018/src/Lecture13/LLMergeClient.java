package Lecture13;

import java.util.Scanner;

public class LLMergeClient {

public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();

		
		LinkedList list = new LinkedList();

		for (int i = 0; i < N; i++) {
			list.addLast(scn.nextInt());
		}

		LinkedList other = new LinkedList();
		
		for (int i = 0; i < M; i++) {
			other.addLast(scn.nextInt());
		}
		LinkedList ll=list.merge(other);
		ll.display();
	
		
}

}
