package Lecture12;

public class Stack {

	  public int capacity;
	  public int[] data;
	  public int tos;
	  public static final int DEFAULT_CAPACITY=5;
	  public Stack() {
	    this(DEFAULT_CAPACITY);
	  }
	  public Stack(int value) {
	    capacity=value;
	    data=new int[capacity];
	    tos=-1;
	  }
	  public int size(){
	    int size=tos+1;
	    
	    return size;
	    
	  }
	  public int sum() {
		  int sum1=0; 
		  for(int i=0 ; i<this.size() ; i++) {
			  sum1=sum1+this.data[i];
		  }
		  return sum1;
	  }
	  public void push(int value) throws Exception {
	    if(this.size()==this.data.length) {
	      throw new Exception("StackOverflow");
	      }
	    tos++;
	    this.data[tos]=value;
	  }
	  public int pop() throws Exception {
	    if(this.size()==0) {
	      throw new Exception("StackEmpty");
	    }
	    int rv=this.data[tos];
	    this.data[tos]='\0';
	    tos--;
	    return rv;
	  }
	  
	  public boolean isempty() {
	    if(this.size()==0) {
	      return true;
	    }
	    else {
	      return false;
	    }
	  }
	
}
//	  public  void remove(int k ) throws Exception {
//			
//		
//			String str=new String();
//			str=this.data[tos];
//			str=str.substring(0, this.data[tos].length()-k);
//			this.push(str);
//			
//			
//			
//		}
//	  public void add(String str) throws Exception {
//		  str=this.data[tos]+str;
//		  this.push(str);
//	 }
//	  public  void print(int k ) {
//			
//			String str=new String();
//			str=this.data[tos];
//			char c= str.charAt(k-1);	
//			System.out.println(c);
//		}
//	  public void display() {
//	    for(int i=tos ; i>=0 ; i-- ) {
//	      System.out.println(this.data[i]);
//	    }
//	    System.out.println("END");
//	  }
	
