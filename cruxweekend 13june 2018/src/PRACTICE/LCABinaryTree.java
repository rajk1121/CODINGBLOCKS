package PRACTICE;

import java.util.Scanner;

import Lecture14.BTree;

public class LCABinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		BTree b1=new BTree();
		int v1=s.nextInt();
		int v2=s.nextInt();
		
		b1.lca(v1, v2);

	}

}
