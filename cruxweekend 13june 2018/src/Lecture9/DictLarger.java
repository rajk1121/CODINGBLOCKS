package Lecture9;

import java.util.Scanner;

public class DictLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner s=new Scanner (System.in);
	        String str=s.next();
	        Dict(str , "" , str.charAt(0) , str);
	    }
	    public static void Dict(String str , String res , char c , String ori){
	        if(str.length()==0){
	            
	            if(res.charAt(0)<ori.charAt(0)) {
	            	return;
	            }
	            else if(ori.charAt(0)==res.charAt(0)) {
	            	for(int i=1 ; i<res.length() ; i++) {
	            		if(res.charAt(i)>ori.charAt(i)) {
	            			break;
	            		}
	            		else if(res.charAt(i)==ori.charAt(i)) {
	            			continue;
	            		}
	            		else {
	            			return;
	            		}
	            	}
	            	if(ori.charAt(ori.length()-1)==res.charAt(res.length()-1)) {
	            		return;
	            	}
	            }
	                System.out.println(res);
	            
	        }
	        
	        for(int i=0 ; i<str.length() ; i++){
	            char cc=str.charAt(i);
	            String ros=str.substring(0,i)+str.substring(i+1);
	            Dict(ros  , res+cc , c , ori);
	        }
	    }
}
