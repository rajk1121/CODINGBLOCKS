package Lecture19;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Graph graph=new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B", 10);
		graph.addEdge("A", "D", 40);
		graph.addEdge("B", "C", 10);
		graph.addEdge("C", "D", 10);
		graph.addEdge("D", "E", 2);
		graph.addEdge("E", "F", 8);
		graph.addEdge("F", "G", 3);
		graph.addEdge("G", "E", 3);
		graph.display();
		System.out.println("***************************");
		graph.removeVertex("D");
		graph.display();
		graph.Dijkstra("A");
		
	}

}
