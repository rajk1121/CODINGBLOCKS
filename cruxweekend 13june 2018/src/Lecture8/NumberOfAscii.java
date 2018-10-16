package Lecture8;

import java.util.Scanner;

public class NumberOfAscii {

	public static void main(String[] args) {
		 Scanner s=new Scanner (System.in);
	        int n=s.nextInt();
	        int count1=count( 1 , n ,1 , n , 0);
	        System.out.println(count1);
	        mazepathe(1,n,1,n,"");
	        
	    }
	   
	    public static int count(int cc , int ec ,int cr , int er , int count1){
	        if(cc==ec && cr==er){
	            count1++;
	            return count1;
	        }
	        
	        if(cr<er){
	            count1=count(cc , ec , cr+1 , er , count1);
	        }
	        if(cc<ec){
	              count1=count(cc+1 , ec , cr , er , count1);
	        }
	       if(cr<er && cc<ec && cc+1==cr+1) {
	    	   count1=count(cc+1 , ec , cr+1 , er , count1);
	       }
	        return count1;
	    }
	    public static void mazepathe(int cc , int ec , int cr , int er , String res){
	        if(cc==ec && cr==er){
	            System.out.print(res+" ");
	            return;
	        }
	        if(cc>ec || cr>er){
	            return;
	        }
	        
	        mazepathe(cc , ec , cr+1 , er , res+"V");
	        mazepathe(cc+1 , ec , cr , er , res+"H");
	        if(cc+1==cr+1){
	      mazepathe(cc+1 , ec , cr+1 , er , res+"D");
	    }
}

}
