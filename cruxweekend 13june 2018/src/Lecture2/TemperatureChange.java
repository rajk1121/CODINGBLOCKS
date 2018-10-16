package Lecture2;

public class TemperatureChange {

	public static void main(String[] args) {
		
		 int i,F=20;
	
		 int C;
	       for(i=0 ; i<=15 ; i++)
	       {
	    	   F=F*i;
	    	   C=(int)((5.0/9)*(F-32));
	    	   System.out.print(F);
	    	   System.out.print(" ");
	    	   System.out.print(C);
	    	   F=20;
	    	   System.out.println();
	       }
	}

}
