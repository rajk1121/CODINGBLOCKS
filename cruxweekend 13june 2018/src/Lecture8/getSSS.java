package Lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class getSSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		ArrayList<String> list= new ArrayList();
		for(int i=0 ; i<n ; i++) {
			String s1=s.next();
	        list.add(s1);
		
		}
		for(int i=0 ; i< list.size() ; i++) {
			ArrayList<String> result=getSS(list.get(i ));
			ArrayList<String> sorted=mergesort(result , 0 , result.size()-1);
			for(int j=0 ; j<sorted.size() ; j++) {
				System.out.println(sorted.get(j));
			}
		}
		
	}
	public static ArrayList<String> getSS(String str){
		if(str.length()==0) {
			ArrayList<String >base = new ArrayList();
			base.add("");
			return base;
		}
		
		
		
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList <String> myResult=new ArrayList();
		ArrayList <String> recResult = getSS(ros);
			for(int i=0  ; i<recResult.size(); i++) {
			
			myResult.add(recResult.get(i));
			myResult.add(cc+recResult.get(i));
		
		}
		return myResult;
		
		
	}
	public static ArrayList<String>  mergesort(ArrayList<String> result , int low , int high){
		if(low==high) {
			ArrayList<String> base=new ArrayList();
			base.add(result.get(low));
			return base;
			
		}
		
		int mid=(low+high)/2;
		ArrayList<String> one=mergesort(result , low , mid);
		ArrayList<String> two=mergesort(result , mid+1 , high);
		ArrayList<String> sorted=sort(one , two);
		return sorted;
	}
	public static ArrayList<String> sort(ArrayList<String> one , ArrayList<String> two){
		
		
		
		ArrayList<String> sorted=new ArrayList();
		int i=0;
		int j=0;
		while(i<one.size() && j<two.size()) {
			String s1=one.get(i);
			String s2=two.get(j);
			if(s1.compareTo(s2)<0) {
				sorted.add(s1);
				i++;
			}
			if(s1.compareTo(s2)>0) {
				sorted.add(s2);
				j++;
			}
			
			
		}
		while(i<one.size()) {
			sorted.add(one.get(i));
			i++;
		}
		while (j<two.size()) {
			sorted.add(two.get(j));
			j++;
		}
		return sorted;
	}

}
