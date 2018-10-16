package PRACTICE;

import java.util.Scanner;

import Lecture12.Queue;

public class TruckTour {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Queue q=new Queue(n*2);
		for(int i=0 ; i<n*2 ; i++) {
			q.enqueue(s.nextInt());
		}
		int ans=truck(q);
		System.out.println(ans);

	}
	public static int truck(Queue q) throws Exception {
		int size=0;
		int orisize=q.size();
		int pet=0;
		int dis=0;
		int index=0;
		int x=0;
		int y=0;
		while(size<orisize) {
			pet=q.dequeue();
			dis=q.dequeue();
			x=x+pet;
			y=y+dis;
			if(x<y) {
				index++;
				size=0;
				x=0;
				y=0;	
				q.enqueue(pet);
				q.enqueue(dis);
			}else {
				size=size+2;
				x=x-y;
				y=0;
				q.enqueue(pet);
				q.enqueue(dis);
				
			}
		}
		return q.index();
		
	}

}
