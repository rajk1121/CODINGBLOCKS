package BITS;

public class IncredibleHulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int far=10;
		int ans=IncredibleHulk(far);
		int ans1=IncredibleHulkLess(far);
		System.out.println(ans1);
		System.out.println(ans);
		

	}

	private static int IncredibleHulkLess(int far) {
		// TODO Auto-generated method stub
		//Count number of set bits
		int j=1;
		int x=0;
		for(int i=0;i<32;i++) {
			if((j&far)!=0) {
				x++;
			}
			j=j<<1;
		}
		return x;
	}

	public static int IncredibleHulk(int far) {
		// TODO Auto-generated method stub
		int steps=0;
		int cs=0;
		int rs=far;
		int j=1;
		while(cs!=far) {
			if((rs&(rs-1))==0) {
				steps++;
				cs=cs+rs;
			}else {
				while(j<rs)
				   {
						j=j<<1;
				   }
				j=j>>1;
				steps++;
				cs=cs+j;
				rs=rs-j;
				}
			
		}
		
		
		return steps;
	}

}
