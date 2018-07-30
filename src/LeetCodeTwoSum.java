import java.util.HashMap;

public class LeetCodeTwoSum {

	public int[] twoSum (int[] arr, int target) 
	{
		//System.out.println("in");
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			map.put(target - arr[i], i);
		}
		for (int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				if(map.get(arr[i])!= i) {
					return new int[] {i, map.get(arr[i])}; 
							
				}
			}
		}
		return new int[2];
	}
	
	public static void main(String args[])
	{
		LeetCodeTwoSum ts= new LeetCodeTwoSum();
		int[] a = {1,2,4,5,3};
	int[] indices = 	ts.twoSum (a, 5);
		System.out.println(indices);
	}
}
