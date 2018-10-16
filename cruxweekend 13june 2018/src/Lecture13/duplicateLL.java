package Lecture13;

import java.util.ArrayList;
import java.util.Scanner;

public class duplicateLL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
			int T=s.nextInt();
			ArrayList<LinkedList> list=new ArrayList();
			for(int i=0 ; i<T ; i++) {
				int n=s.nextInt();
				LinkedList list1=new LinkedList();
				for(int j=0 ; j<n ; j++) {
					list1.addAt(j, s.nextInt());
				}
				list.add(list1);
			}
			for(int i=0 ; i<T ; i++) {
				LinkedList list1=new LinkedList();
				list1=list.get(i);
				if(list1.size()==1) {
					list1.display();
				}
				else {
				list1.duplicates();
				list1.display();
			}
			}
			
			
	}

}
