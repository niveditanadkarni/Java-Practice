
public class ArrayRotate {

	
	public static int[] rotate(int[] arr, int order) {
		int i, j, temp;
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (i = 0; i < order; i++) {
			for (j = arr.length - 1; j > 0; j--) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				System.out.println(temp);			
			}
			
		}
		return arr;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotate ar = new ArrayRotate();
		int[] array = {0,1,2,3,4,5,6,7};
		int[] result = ArrayRotate.rotate(array, 3);
		System.out.println(result);	
		
		
		

	}

}
