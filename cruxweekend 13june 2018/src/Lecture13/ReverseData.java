package Lecture13;

public class ReverseData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		for(int i=0 ; i<4 ; i++) {
			list.addLast((i+1)*10);
		}
		list.display();
		list.reverseDI();
		list.display();
		list.reversePI();
		list.display();
	}



}
