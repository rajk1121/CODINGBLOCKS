package Lecture9;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		ArrayList<String> list =list=maze(1 , n , 1 , m  );
		System.out.println(list);
		int count=Maze(1, n , 1 , m , 0 );
		System.out.println(count);
		 count=countMazePath(m , n , 1 , 1 );
		System.out.println(count);
		
	}
public static int Maze( int cc , int ec , int cr , int er , int count ) {
	
	if(cr==er && cc==ec) {
		count++;
		return count;
	}
	if(cc<ec) {
	count=Maze(cc+1 , ec , cr , er , count);
	}
	if(cr<er) {
		count=Maze(cc , ec , cr+1 , er , count);
	}
	return count;
    }
public static ArrayList<String> maze( int cc , int ec , int cr , int er   ) {
	
	if(cr==er && cc==cr) {
		ArrayList<String> base=new ArrayList();
		base.add("");
		return base;
	}
	
	if(cr>er || cc>ec) {
		ArrayList<String> base=new ArrayList();
		return base;
	}
	
	ArrayList<String> myResult=new ArrayList();
		ArrayList<String> hResult=maze(cc+1 , ec , cr , er  );
		ArrayList<String> vResult=maze(cc , ec , cr+1 , er );
		for(int i=0 ; i<hResult.size() ; i++) {
			myResult.add('H'+hResult.get(i));
		}
		for(int i=0 ; i<vResult.size() ; i++) {
			myResult.add('V'+vResult.get(i));
		}
	
	return myResult;
    }
public static int countMazePath(int er, int ec, int cr, int cc) {
	if (cc == ec && cr == er) {
		return 1;
	}
	if (cr > er || cc > ec) {
		return 0;
	}

	int count = 0;
	count = count + countMazePath(er, ec, cr, cc + 1);
	count = count + countMazePath(er, ec, cr + 1, cc);
	return count;
}

}

