package Lecture12;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q=new Queue(6);
		for(int i=0 ; i<6 ; i++) {
			q.enqueue((i+1)*10);
		}
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(10);
		q.display();
		q.enqueue(10);

	}

}
