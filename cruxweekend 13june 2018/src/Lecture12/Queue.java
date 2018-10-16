package Lecture12;

public class Queue {
	
	private int size;
	private int front;
	private int[] data;
	private int capacity;
	public static final int DEFAULT_CAPACITY=5;
	public Queue(){
		this(DEFAULT_CAPACITY);
	}
	public Queue(int value) {
		// TODO Auto-generated constructor stub
		this.capacity=value;
		 this.data=new int[capacity];
		 this.front=0;
		 this.size=0;
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return this.size()==0;
	}
	public void enqueue(int value) throws Exception{
		if(this.size()==this.data.length) {
			throw new Exception ("Full");
		}
		
		int ai=(this.size+this.front)%this.data.length;
		this.data[ai]=value;
		this.size++;
		
		
		
	}
	public void hst(Queue q) throws Exception {
		int sum1=q.dequeue();
		int sum2=0;
		int sum=0;
		int sum3=0;
		
		while(q.isEmpty()) {
			
			sum2=q.dequeue();
			if(sum2>sum1) {
			sum3=sum3+sum1+sum1;
			}else {
				if(sum3>sum) {
					sum=sum3;
					sum3=0;
				}
				
			}
			
			
		}
		
		
	}
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception ("Queue Empty");
		}
		
		
		int rv=this.data[this.front];
		this.data[this.front]=0;
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rv;
	}
	public void display() {
		int ai=this.front;
		for(int i=0 ; i<this.size() ; i++) {
			int j=(ai)%this.data.length;
			System.out.print(this.data[j]+"=>");
			ai++;
			
		}
		System.out.println("End");
		
	}
	public int index() {
		// TODO Auto-generated method stub
		return this.front/2;
		
		
	}

}
