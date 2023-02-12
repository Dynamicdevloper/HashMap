package in.hashmap.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,2,3,3,3,4,4,4,4};
		int target=9;
		F4Sum(arr,target);
	}

	private static void F4Sum(int[] arr,int target) {
		
		//ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int rem=target-arr[i]-arr[j];
				int front=j+1;
				int back=arr.length-1;
				while(front < back) {
					int sum=arr[front]+arr[back];
					if(rem<sum) front++;
					else if(rem>sum) back--;
					else {
						ArrayList<Integer> list=new ArrayList<>();
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[front]);
						list.add(arr[back]);
						System.out.println(arr[i] +" "+arr[j]+ " "+arr[front]+" "+arr[back]);
						while(front<back && arr[front]==list.get(2)) front++;
						while(front<back && arr[back]==list.get(3)) back--;
					}
					while(j+1<arr.length && arr[j+1]==arr[j]) j++;
				}
				while(i+1<arr.length && arr[i+1]==arr[i]) i++;
			}
		}
	}

}
