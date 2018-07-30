

import java.util.HashSet;
import java.util.Set;

/* find the indices of two numbers in a array such that the sum is a target value*/
public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		 int arr[] = { 1, 2, 3, 4 };
			int k = 5;
		
		boolean result = hasValue(arr, k);

		System.out.println("result " + result);

		/*
		 * for (int i = 0; i < arr.length-1; i++) { for (int j = i + 1; j < arr.length;
		 * j++) {
		 * 
		 * if(arr[j]<=k) { System.out.println("j"+arr[j]); int sum = arr[i] + arr[j];
		 * 
		 * if (sum == k) { System.out.println(i + " , " + j); } } } }
		 */

	}

	@SuppressWarnings("unused")
	private static boolean hasValue(int[] arr, int k) {
		 
		
		Set<Integer> comp = new HashSet<Integer>();
		int diff;
		for (int i = 0; i < arr.length; i++) {
			diff = k - arr[i];
			if (!comp.contains(arr[i])) { 
				comp.add(diff);
			
		}
			System.out.println(i);
			return false;
		
	}
		return true;
	
	
	}	

}
