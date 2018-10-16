package PRACTICE;

import java.util.ArrayList;

public class KnapsackAllPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v= {60,100,120};
		int[] w= {10,20,30};
		int W=50;
		ArrayList<Integer> list=new ArrayList();
		list=KnapSack(list,w , v , W , 0 , 0 , 0);
		int max=Integer.MIN_VALUE;
		for(int i=1 ; i<list.size();i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		System.out.println(max);
		
		
		

	}

	private static ArrayList<Integer> KnapSack(ArrayList<Integer> list,int[] w, int[] v, int W, int V, int Weight , int j) {
		// TODO Auto-generated method stub
		if(W<Weight) {
			return list;
		}
		if(W>=Weight) {
			list.add(V);
			
		}
		
		
		for(int i=j;i<w.length;i++) {
		Weight=Weight+w[i];
		V=V+v[i];
		list=KnapSack(list, w, v, W, V, Weight, i+1);
		V=V-v[i];
		Weight=Weight-w[i];
		}
		return list;
	}

	

	
}
