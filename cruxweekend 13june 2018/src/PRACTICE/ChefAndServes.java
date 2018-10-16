package PRACTICE;

import java.util.Scanner;

public class ChefAndServes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0 ; i<T ; i++){
		int P1=s.nextInt();
		int P2=s.nextInt();
		int K =s.nextInt();
		if((P1+P2)%K!=0) {
			System.out.println("COOK");
		}
		else {
			System.out.println("CHEF");
		}




		}



	}

}
