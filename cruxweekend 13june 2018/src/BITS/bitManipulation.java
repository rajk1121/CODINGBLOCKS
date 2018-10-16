package BITS;

public class bitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		n=n<<8;
		n=Integer.MAX_VALUE;
		String k=Integer.toBinaryString(n);
		n=~n;
		System.out.println(k);
		k=Integer.toBinaryString(n);
		System.out.println(k);
//		int n=7;
//		System.out.println(Integer.toBinaryString(12));
//		int n='a';
//		String str=Integer.toBinaryString(n);
////		System.out.println(str);
////		n=str.charAt(0);
//		System.out.println(n);
//		
	}

}
