package PRACTICE;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=new String();
		str=s.next();
		int ans=LS(str);
		System.out.println(ans);

	}


	public static int LS(String str) {
		int length=0;
		int fl=0;
		int j=0;
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0 ; i<str.length() ; i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);
				length++;
				if(length>fl) {
					fl=length;
				}
			}else {
				int x=map.get(str.charAt(i));
				if(x>=j) {
					j=x+1;
				}
				map.put(str.charAt(i), i);
				length=i-j+1;
				if(length>fl) {
					fl=length;
				}
			}
		}
		return fl;
		
		
	}

}
