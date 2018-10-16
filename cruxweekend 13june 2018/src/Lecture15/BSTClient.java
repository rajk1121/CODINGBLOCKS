package Lecture15;

public class BSTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree=new BST();
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(5);
		tree.add(6);
//		tree.add(2);
//		tree.add(87);
		tree.display();
		tree.range(3,5);
		
		System.out.println("******************************");
		System.out.println(tree.isBST());
		
	}

}
