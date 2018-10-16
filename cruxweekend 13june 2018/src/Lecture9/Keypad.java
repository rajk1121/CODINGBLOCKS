package Lecture9;

import java.util.ArrayList;
import java.util.Scanner;

public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        ArrayList<String> list=new ArrayList();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("pqrs");
        list.add("tuv");
        list.add("wx");
        list.add("yz");
        int rev=0;
        int rem=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
            
        ArrayList<String> result=Ans( rev , list , 0);
        System.out.println(result.size());
        System.out.println(result);
    }
    public static ArrayList<String> Ans(int n , ArrayList<String> list ,int l){
        if(l==1) {

            ArrayList<String> base=new ArrayList();
            base.add("");
            return base;
        
        }
    	if(n/10==0){
    		l=1;
    		}
        int m=n/10;
        
        ArrayList<String> myResult=new ArrayList();
        ArrayList<String> recResult=Ans(m , list , l);
        n= n%10;
        String mystring=new String();
        mystring=list.get(n-1);
        for(int j=0 ; j<mystring.length() ; j++){
            for(int i=0 ; i<recResult.size() ; i++){
                myResult.add(mystring.charAt(j)+recResult.get(i));
            }
        }
        return myResult;
        
    }

}
