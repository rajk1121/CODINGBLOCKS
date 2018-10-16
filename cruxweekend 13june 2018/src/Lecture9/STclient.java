package Lecture9;

public class STclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[]arr= {3,8,7,6,-2,-8,4,9};
		SegmentTree tree=new SegmentTree(arr);
		tree.display();
	}

}
