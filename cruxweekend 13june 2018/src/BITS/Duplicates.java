package BITS;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,10,20,30,30,40,50,50};
		int ans=Duplicate(arr);
		System.out.println(ans);
		
	}

	private static int Duplicate(int[] arr) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=0 ;i<arr.length;i++) {
			x=x^arr[i];
		}
		int i=0;
		int j=1;
		while((x|j)!=x) {
			j=j<<1;
			i++;
		}
		x=0;
		int y=0;
		for(int k=0;k<arr.length;k++) {
			if((arr[k]|j) ==arr[k]) {
			x=x^arr[k];	
			}else {
				y=y^arr[k];
			}
		}
		return y;
	}

}
