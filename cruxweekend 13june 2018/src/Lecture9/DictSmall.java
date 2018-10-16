package Lecture9;

import java.util.Scanner;

public class DictSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
	    String str=s.next();
	    getperm(str , "" ,str) ;
	        
	        
	    } 
	    public static void getperm(String str, String res ,String ori) {
	        
			if (str.length() == 0) {
			  if(res.charAt(0)>ori.charAt(0)) {
				  return;
			  }
			  else if(ori.charAt(0)==res.charAt(0)) {
				  for(int i=0 ; i<res.length()-1 ; i++) {
					  if(res.charAt(i)>ori.charAt(i)) {
						  return;
					  }
					  else if(res.charAt(i)<ori.charAt(i)) {
						  break;
					  }
					  else {
						  continue;
					  }
				  }
				  if(res.charAt(res.length()-1)==ori.charAt(ori.length()-1)) {
					  return;
				  }
			  }
				System.out.println(res);
				return;
			}
			for (int i = 0; i < str.length(); i++) {
				char cc = str.charAt(i);
				String ros = str.substring(0, i) + str.substring(i + 1);
				getperm(ros, res + cc , ori);
			}
		}


}
