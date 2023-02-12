package in.hashmap.problems;

import java.util.HashMap;
public class CountSubarrayWithXorKProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {4,2,2,6,4};
		int k=6;
		int ans= countsubarrayWithXorK(arr, k);
		System.out.print(ans);
	}

	public static int countsubarrayWithXorK(int[] arr, int k) {
		
		int xor=0;
		int count=0;
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<arr.length; i++){
			xor=xor^arr[i];
			if(map.containsKey(xor^k)) {
				count+=map.get(xor^k);
			}
			if(xor==k) {
				count++;
			}
			
			if(map.containsKey(xor)) {
				map.put(xor,  map.get(xor)+1);
			}else {
				map.put(xor, 1);
			}
		}
		return count;
	}

}
