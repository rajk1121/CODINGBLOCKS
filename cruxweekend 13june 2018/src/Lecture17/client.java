package Lecture17;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		h.add(new Student(300, 3, "c"));
//		h.add(new Student(200, 2, "b"));
//		h.add(new Student(100, 1, "a"));
//		h.add(new Student(500, 5, "e"));
//		h.add(new Student(600, 6, "f"));
//		h.add(new Student(800, 8, "h"));
//		h.add(new Student(700, 7, "g"));
//		h.add(new Student(400, 4, "d"));
//		h.add(new Student(900, 9, "i"));
		
//		h.display(0);
//		h.remove();
//		h.display();
		Scanner s=new Scanner (System.in);
		int N=s.nextInt();
		int k=s.nextInt();
		int[] A=new int[N];
		for(int i=0 ; i< N ;i++) {
			A[i]=s.nextInt();
		}
		int ans=cookies(k, A);
		System.out.println(ans);
	}
	public static  int cookies(int k, int[] A) {
		   Heap h=new Heap();
		      for(int i=0 ; i<A.length ; i++){
		         h.add(A[i]);
		     }
		      int count=0;
		      boolean find=false;
		      int x=h.remove();
		      while(x<k){
		        int y=h.remove();
		        int n=x+2*y;
		        if(n>=k){
		          find=true;
		          break;
		        }
		        count++;
		        x=h.remove();
		        
		        
		        
		      }
		      if(find){
		        return count;
		      }else{
		        return -1;
		      }
		      
		     
		     
		     
		   

		}

	public static class Student implements Comparable <Student>{
		
		int marks;
		int rank;
		String name;
		Student(int  marks , int rank , String name){
			this.rank=rank;
			this.name=name;
			this.marks=marks;
		}
		public String toString() {
			return "{Name "+this.name+" ,Marks="+this.marks+",Rank "+this.rank+"}";
		}
		

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.marks-o.marks;
		}
		
		
		
		
		
	}

}
