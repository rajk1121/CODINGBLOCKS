package Lecture16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String str=s.next();
		System.out.println(getMax(str));
		
	}
	public static char getMax(String str) {
		
		HashMap<Character , Integer> map=new HashMap<>();
		for(int i=0 ; i<str.length() ; i++) {
			char c=str.charAt(i);
			if(map.containsKey(str.charAt(i))) {
				int a=map.get(c);
				a++;
				map.put(str.charAt(i), a);
			}else {
				map.put(str.charAt(i),1 );
			}
			
		}
		Set<Map.Entry<Character, Integer>> entries=map.entrySet();
		int x=Integer.MIN_VALUE;
		char max='\0';
		for(Map.Entry<Character, Integer> entry:entries) {
			int b=entry.getValue();
			if(b>x) {
				x=b;
				max=entry.getKey();
			}
		}
		return max;
		
		
	}

}
