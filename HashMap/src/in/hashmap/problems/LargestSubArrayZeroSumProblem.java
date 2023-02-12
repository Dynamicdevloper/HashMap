package in.hashmap.problems;

import java.util.HashMap;

public class LargestSubArrayZeroSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,-1,2,-2,3,4,5,-3};
		largestSubArrayZeroSum(arr);
	}

	private static void largestSubArrayZeroSum(int[] arr) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int sum=0; 
		int max=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(sum==0) {
				max=i+1;
			}else {
				if(map.containsKey(sum)) {
					max=Math.max(max, i-map.get(sum));
				}else {
					map.put(sum, i);
				}
			}
		}
		
		System.out.print(max);
	}

}
