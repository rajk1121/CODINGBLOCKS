package Lecture16;



public class HashTable<K , V> {
	private class HTPair{
		K key;
		V value;
		 HTPair(K key , V value) {
			this.key=key;
			this.value=value;
		}
		public boolean equals(Object other) {
			HTPair op=(HTPair) other;
			return this.key.equals(op.key);
		}
		public String toString() {
			return "{"+this.key+" "+this.value+"}";
		}
		
		
	}
	
	int size;
	private LinkedList<HTPair>[] bucketArray;
	private final static int DEFAULT_CAPACITY=5;
	public HashTable(){
		this(DEFAULT_CAPACITY);
	}
		public HashTable(int value) {
			
			this.size=0;
			this.bucketArray=(LinkedList<HTPair>[]) new LinkedList[value];
		}
		public void put(K key, V value) throws Exception {
			int bi=this.hashfunction(key);
			LinkedList<HTPair> bucket=this.bucketArray[bi];
			HTPair pta=new HTPair(key,value);
			if(bucket==null) {
				bucket=new LinkedList<>();
				bucket.addLast(pta);
				this.size++;
				this.bucketArray[bi]=bucket;
			}
			else {
				int findAt=bucket.find(pta);
				if(findAt==-1) {
					bucket.addLast(pta);
					this.bucketArray[bi]=bucket;
					this.size++;
				}else {
					bucket.getAt(findAt).value=value;
					this.bucketArray[bi]=bucket;
									
				}
			}
		}
		public void display() {
			
			for(LinkedList<HTPair> bucket:this.bucketArray) {
				if(bucket!=null && !bucket.isEmpty()) {
					bucket.display();
				}else {
					System.out.println("null");
					
				}
				System.out.println("-----------------");
				
			}
			System.out.println("******************");
			
		}

		public int hashfunction(K key) {
			int hc=key.hashCode();
			hc=Math.abs(hc);
			int bi=hc%this.bucketArray.length;
			return bi;
			
		}

}
