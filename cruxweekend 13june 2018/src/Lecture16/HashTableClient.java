package Lecture16;

public class HashTableClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			HashTable<String, Integer> table=new HashTable<>(5);
			table.put("India", 300);
			table.put("Russia", 250);
			table.put("Auatralia", 50);
			table.put("India", 200);
			table.put("Auatralia", 150);
			System.out.println(table.size);
			table.display();
	}

}
