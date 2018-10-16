package Lecture19;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Graph {
	private class Vertex {
		String name;
		HashMap<Vertex, Integer> nbrs;
		int cost;//For Dijkstra
		boolean include;

		Vertex(String name) {
			this.name = name;
			this.nbrs = new HashMap<>();
			this.cost=Integer.MAX_VALUE;
			this.include=false;
		}

		public boolean equals(Object other) {
			Vertex ov = (Vertex) other;
			return this.name.equals(ov.name);
		}

		public int hashCode() {
			return this.name.hashCode();
		}

		public void display() {
			String str = this.name + "=>";
			Set<Vertex> nbrs = this.nbrs.keySet();
			for (Vertex nbr : nbrs) {
				str = str + nbr.name + "(" + this.nbrs.get(nbr) + "), ";
			}
			str = str + "END";
			System.out.println(str);
		}
	}

	HashMap<String, Vertex> vtces;


	public Graph() {
		this.vtces = new HashMap<>();
	}

	public int numVertices() {
		return this.vtces.size();
	}

	public void addVertex(String name) {
		if (this.vtces.containsKey(name)) {
			return;
		}
		Vertex vtx = new Vertex(name);
		this.vtces.put(name, vtx);
	}
	
	public Vertex minVertex() {
		Collection<Vertex> v=this.vtces.values();
		Vertex minVertex = null;
		int min=Integer.MAX_VALUE;
		for(Vertex v1 : v) {
		
			if(v1.cost<min && !v1.include) {
				min=v1.cost;
				minVertex = v1;
			}
		}
		return minVertex;
		
	}
	public void Dijkstra(String source) {
		this.vtces.get(source).cost=0;
		
		
		for(int i=0 ; i<this.vtces.size() ; i++) {
			Vertex v=this.minVertex();
			if(v==null) {
				this.print(source);
				return;
			}
			v.include=true; 
			
			Set<Map.Entry<Vertex, Integer>> edges = v.nbrs.entrySet();
			for(Map.Entry<Vertex, Integer> edge : edges) {
				if(!edge.getKey().include && edge.getKey().cost > (edge.getValue() + v.cost))  {
					edge.getKey().cost = edge.getValue() + v.cost;
				
				}
				
			}
			
			
			
		}
		this.print(source);
		
		
		
		
		
	}

	private void print(String source) {
		// TODO Auto-generated method stub
		Vertex v=this.vtces.get(source);
		Collection<Vertex> vtxs=this.vtces.values();
		for(Vertex vtx : vtxs) {
			if(vtx!=v) {
				System.out.println(vtx.name + "        " + vtx.cost);
			}
		}
		
		
	}

	public void removeVertex(String name) {
		if (!this.vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = this.vtces.get(name);
		Set<Vertex> nbrs = vtx.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			nbr.nbrs.remove(vtx);
		}

		this.vtces.remove(name);

	}

	public int numEdges() {
		int rv = 0;
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			rv = rv + vtx.nbrs.size();
		}
		rv = rv / 2;
		return rv;
	}

	public void addEdge(String name1, String name2, int cost) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.put(vtx2, cost);
		vtx2.nbrs.put(vtx1, cost);
	}

	public void removeEdge(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.remove(vtx2);
		vtx2.nbrs.remove(vtx1);
	}

	public void display() {
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			vtx.display();
		}
	}

	public boolean hasPath(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);
		if (vtx1 == null || vtx2 == null) {
			return false;
		}
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		return hasPathBFSI(vtx1, vtx2);
	}

	private boolean hasPathDFS(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		if (!explored.containsKey(vtx1)) {
			explored.put(vtx1, true);
		} else {
			return false;
		}

		if (vtx1.nbrs.containsKey(vtx2)) {
			return true;
		}

		Set<Vertex> nbrs = vtx1.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			if (hasPathDFS(nbr, vtx2, explored)) {
				return true;
			}
		}

		return false;
	}

	private boolean hasPathBFSI(Vertex vtx1, Vertex vtx2) {
		LinkedList<Vertex> queue = new LinkedList<>();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		queue.add(vtx1);
		while (!queue.isEmpty()) {
			Vertex rvtx = queue.remove();
			if (!explored.containsKey(rvtx)) {
				explored.put(rvtx, true);
				if (rvtx.nbrs.containsKey(vtx2)) {
					return true;
				} else {
					Set<Vertex> nbrs = rvtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}
				}
			}
		}
		return false;

	}

	public void dft() {
		LinkedList<Vertex> stack = new LinkedList<>();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				stack.addFirst(vtx);
			}
			while (!stack.isEmpty()) {
				Vertex rvtx = stack.removeFirst();
				if (!explored.containsKey(rvtx)) {
					explored.put(rvtx, true);
					System.out.print(rvtx.name + " ");
					Set<Vertex> nbrs = rvtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							stack.addFirst(nbr);
						}
					}

				}
			}
		}
	}

	public void bft() {
		LinkedList<Vertex> queue = new LinkedList<>();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				queue.add(vtx);
			}
			while (!queue.isEmpty()) {
				Vertex rvtx = queue.remove();
				if (!explored.containsKey(rvtx)) {
					explored.put(rvtx, true);
					System.out.print(rvtx.name + " ");
					Set<Vertex> nbrs = rvtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}

				}
			}
		}
	}
	
	public boolean isConnected() {
		LinkedList<Vertex> queue = new LinkedList<>();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		Collection<Vertex> vtces = this.vtces.values();
		queue.add((Vertex) vtces.toArray()[0]);
		while (!queue.isEmpty()) {
			Vertex rvtx = queue.remove();
			if (!explored.containsKey(rvtx)) {
				explored.put(rvtx, true);
				//System.out.print(rvtx.name + " ");
				Set<Vertex> nbrs = rvtx.nbrs.keySet();
				for (Vertex nbr : nbrs) {
					if (!explored.containsKey(nbr)) {
						queue.add(nbr);
					}
				}

			}
		}
		
		return this.vtces.size()==explored.size();
	}
}
