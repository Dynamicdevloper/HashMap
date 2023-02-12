package in.hashmap.problems;

import java.util.LinkedList;

public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Node<K,V>{
	
	K key;
	V value;
	
	public Node(K key, V value) {
		this.key=key;
		this.value=value;
	}
}

class HashMap<K, V>{
	
	@SuppressWarnings("unused")
	private int n;  //no. of elements
	private int N;  //no. of buckets
	@SuppressWarnings("rawtypes")
	private LinkedList<Node> buckets[];
	
	@SuppressWarnings("unchecked")
	public HashMap() {
		this.N=4;
		this.buckets=new LinkedList[N];
		for(int i=0; i<N; i++) {
			buckets[i]=new LinkedList<>();
		}
	}
	
	
	
}







